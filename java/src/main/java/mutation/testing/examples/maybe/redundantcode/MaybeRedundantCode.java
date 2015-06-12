package mutation.testing.examples.maybe.redundantcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class MaybeRedundantCode {
    public String findWordThatComesAlphabeticallyFirst(Set wordList) {
        ArrayList<String> list = new ArrayList<>(wordList);

        Collections.sort(list);

        return list.get(0);
    }

}
