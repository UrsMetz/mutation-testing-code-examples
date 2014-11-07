package mutation.testing.examples;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalcWithListsTest {
    @Test
    public void addingOneNumber() throws Exception {
        int result = new StringCalcWithLists().add("3");
        assertThat(result, is(3));
    }
}
