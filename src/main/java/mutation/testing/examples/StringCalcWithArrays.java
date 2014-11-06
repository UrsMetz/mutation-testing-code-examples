package mutation.testing.examples;

public class StringCalcWithArrays {
    public int add(String listOfNumbers) {
        int[] parsedNumbers = parse(listOfNumbers);
        int sum = 0;
        for (int i = 0; i < parsedNumbers.length; i++) {
            sum += parsedNumbers[i];
        }
        return sum;
    }

    private int[] parse(String args) {
        String[] split = args.split(",");
        int length = split.length;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        return numbers;
    }
}
