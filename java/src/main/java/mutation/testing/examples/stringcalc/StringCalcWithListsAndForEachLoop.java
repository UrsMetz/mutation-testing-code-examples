package mutation.testing.examples.stringcalc;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class StringCalcWithListsAndForEachLoop {
    public int add(String listOfNumbers) {
        List<Integer> parsedNumbers = parse(listOfNumbers);
        int sum = 0;
        for (Integer parsedNumber : parsedNumbers) {
            sum += parsedNumber;
        }
        return sum;
    }

    private List<Integer> parse(String args) {
        List<String> split = asList(args.split(","));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (String aSplit : split) {
            numbers.add(Integer.parseInt(aSplit));
        }
        return numbers;
    }
}
