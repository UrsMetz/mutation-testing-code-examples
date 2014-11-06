package mutation.testing.examples;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalcWithArraysTest {
    @Test
    public void addingOneNumber() throws Exception {
        int result = new StringCalcWithArrays().add("3");
        assertThat(result, is(3));
    }
}
