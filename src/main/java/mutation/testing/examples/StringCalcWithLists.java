package mutation.testing.examples;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class StringCalcWithLists {
    public int add(String listOfNumbers) {
        List<Integer> parsedNumbers = parse(listOfNumbers);
        int sum = 0;
        for (int i = 0; i < parsedNumbers.size(); i++) {
            sum += parsedNumbers.get(i);
        }
        return sum;
    }

    private List<Integer> parse(String args) {
        List<String> split = asList(args.split(","));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < split.size(); i++) {
            numbers.add(Integer.parseInt(split.get(i)));
        }
        return numbers;
    }
}
