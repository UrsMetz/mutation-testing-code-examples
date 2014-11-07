package mutation.testing.examples;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalcWithListsAndForEachLoopTest {
    @Test
    public void addingOneNumber() throws Exception {
        int result = new StringCalcWithListsAndForEachLoop().add("3");
        assertThat(result, is(3));
    }
}
