package mutation.testing.examples.redundantcode;

import java.util.*;

import static java.util.Arrays.asList;

public class RedundantCode {
    public String findSpecialOne(String... args) {
        Set<String> strings = asSortedSet(args);

        ArrayList<String> list = new ArrayList<>(strings);

        Collections.sort(list);

        return list.get(0);
    }

    private SortedSet<String> asSortedSet(String[] args) {
        return new TreeSet<>(asList(args));
    }
}
