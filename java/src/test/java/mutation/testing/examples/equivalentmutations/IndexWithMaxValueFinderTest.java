package mutation.testing.examples.equivalentmutations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IndexWithMaxValueFinderTest {

    private IndexWithMaxValueFinder maxFinder = new IndexWithMaxValueFinder();

    @Test
    public void maxIndexForSingleElementArrayIsOne() {
        int result = maxFinder.findIndexOfMax(new int[]{1});
        assertThat(result, is(0));
    }

    @Test
    public void findMaxIndexWhenMaxValueIsFirstElement() {
        int result = maxFinder.findIndexOfMax(new int[]{6, 3});
        assertThat(result, is(0));
    }

    @Test
    public void findMaxIndexWhenMaxValueIsLastElement() {
        int result = maxFinder.findIndexOfMax(new int[]{6, 3, 10});
        assertThat(result, is(2));
    }

    @Test
    public void findMaxIndexWhenMaxIsInTheMiddle() {
        int result = maxFinder.findIndexOfMax(new int[]{3, 7, 4});
        assertThat(result, is(1));
    }
}
