package mutation.testing.examples.redundantcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RedundantCodeTest {

    private final RedundantCode underTest = new RedundantCode();

    @Test
    public void whenOnlyOneStringIsGivenItReturnsThisString() throws Exception {
        String result = underTest.findSpecialOne("1");
        assertThat(result, is("1"));
    }

    @Test
    public void findOne1() throws Exception {
        String result = underTest.findSpecialOne("1", "2");
        assertThat(result, is("1"));
    }

    @Test
    public void findOne2() throws Exception {
        String result = underTest.findSpecialOne("3", "1", "2");
        assertThat(result, is("1"));
    }

    @Test
    public void findOne10() throws Exception {
        String result = underTest.findSpecialOne("c", "z", "a");
        assertThat(result, is("a"));
    }
}
