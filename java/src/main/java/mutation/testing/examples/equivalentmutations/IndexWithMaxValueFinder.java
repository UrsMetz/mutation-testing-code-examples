package mutation.testing.examples.equivalentmutations;

// source: https://www.st.cs.uni-saarland.de/edu/testingdebugging10/slides/10-MutationTesting.pdf
public class IndexWithMaxValueFinder {
    public int findIndexOfMax(int[] numbers) {
        int r = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[r]) {
                r = i;
            }
        }
        return r;
    }
}
