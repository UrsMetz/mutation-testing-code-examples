package mutation.testing.examples.maybe.redundantcode;

import org.junit.Test;

import java.util.TreeSet;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MaybeRedundantCodeTest {
    @Test
    public void test() throws Exception {
        String result = new MaybeRedundantCode()
                .findWordThatComesAlphabeticallyFirst(
                        new TreeSet(asList("xyz", "abc", "qwertz")));
        assertThat(result, is("abc"));
    }
}
