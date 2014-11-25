package mutation.testing.examples.equivalentmutations;

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
