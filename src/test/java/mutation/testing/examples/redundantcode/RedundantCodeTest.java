package mutation.testing.examples.redundantcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RedundantCodeTest {

    private final RedundantCode underTest = new RedundantCode();

    @Test
    public void onlyOneWord() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new RedundantCode.WordList("word"));
        assertThat(result, is("word"));
    }

    @Test
    public void twoWordAlreadyInTheRightOrder() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new RedundantCode.WordList("abc", "bcd"));
        assertThat(result, is("abc"));
    }

    @Test
    public void threeWordsInRandomOrder() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new RedundantCode.WordList("zoo", "albatross", "bird"));
        assertThat(result, is("albatross"));
    }
}
