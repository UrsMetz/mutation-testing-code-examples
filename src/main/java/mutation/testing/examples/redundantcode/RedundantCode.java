package mutation.testing.examples.redundantcode;

import mutation.testing.examples.redundantcode.wordlist.WordList;

import java.util.ArrayList;
import java.util.Collections;

public class RedundantCode {
    public String findWordThatComesAlphabeticallyFirst(WordList wordList) {
        ArrayList<String> list = new ArrayList<>(wordList.asSet());

        Collections.sort(list);

        return list.get(0);
    }

}
