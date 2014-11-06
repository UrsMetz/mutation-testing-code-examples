package mutation.testing.examples;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalcWithArraysTest {
    @Test
    public void addSomeNumbers() throws Exception {
        int result = new StringCalcWithArrays().add("0,0");
        assertThat(result, is(0));
    }
}
