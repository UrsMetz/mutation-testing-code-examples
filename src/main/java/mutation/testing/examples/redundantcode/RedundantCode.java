package mutation.testing.examples.redundantcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import static java.util.Arrays.asList;

public class RedundantCode {
    public String findWordThatComesAlphabeticallyFirst(WordList wordList) {
        ArrayList<String> list = new ArrayList<>(wordList.asSet());

        Collections.sort(list);

        return list.get(0);
    }

    static class WordList {
        private final String[] args;

        WordList(String... args) {
            this.args = args;
        }

        private SortedSet<String> asSet() {
            return new TreeSet<>(asList(this.args));
        }
    }
}
