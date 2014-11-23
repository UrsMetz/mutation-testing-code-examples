package mutation.testing.examples.redundantcode;

import mutation.testing.examples.redundantcode.wordlist.WordList;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RedundantCodeTest {

    private final RedundantCode underTest = new RedundantCode();

    @Test
    public void onlyOneWord() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new WordList("word"));
        assertThat(result, is("word"));
    }

    @Test
    public void twoWordAlreadyInTheRightOrder() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new WordList("abc", "bcd"));
        assertThat(result, is("abc"));
    }

    @Test
    public void threeWordsInRandomOrder() throws Exception {
        String result = underTest.findWordThatComesAlphabeticallyFirst(new WordList("zoo", "albatross", "bird"));
        assertThat(result, is("albatross"));
    }
}
