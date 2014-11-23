package mutation.testing.examples.redundantcode.wordlist;

import java.util.SortedSet;
import java.util.TreeSet;

import static java.util.Arrays.asList;

public class WordList {
    private final String[] args;

    public WordList(String... args) {
        this.args = args;
    }

    public SortedSet<String> asSet() {
        return new TreeSet<>(asList(this.args));
    }
}
