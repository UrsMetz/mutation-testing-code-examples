package mutation.testing.examples.maybe.redundantcode;

import mutation.testing.examples.redundantcode.wordlist.WordList;

import java.util.*;

import static java.util.Arrays.asList;

public class MaybeRedundantCode {
    public String findWordThatComesAlphabeticallyFirst(Set wordList) {
        ArrayList<String> list = new ArrayList<>(wordList);

        Collections.sort(list);

        return list.get(0);
    }

}
