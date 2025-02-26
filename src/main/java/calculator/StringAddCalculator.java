package calculator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringAddCalculator {

    private static final int ZERO = 0;
    private static final Set<String> DELIMITERS = new HashSet<>(Arrays.asList(",", ":"));

    public int splitAndSum(String inputString) {
        if (isInvalidInput(inputString)) {
            return ZERO;
        }
        if (isUseCustomDelimeter(inputString)) {
            DELIMITERS.add(getCustomDelimeter(inputString));
            inputString = trimCustomDelemeterString(inputString);
        }
        String[] split = split(inputString);
        return getSum(toInts(split));

    }

    private String[] split(String inputString) {
        return inputString.split(toRegexString(DELIMITERS));
    }

    private String trimCustomDelemeterString(String inputString) {
        return inputString.substring(4);
    }

    private String getCustomDelimeter(String inputString) {
        return Character.toString(inputString.charAt(2));
    }

    private boolean isUseCustomDelimeter(String inputString) {
        return inputString.charAt(0) == '/' && inputString.charAt(1) == '/' && inputString.charAt(3) == '\n';
    }

    private String toRegexString(Set<String> delimeters) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String delimeter : delimeters) {
            stringBuilder.append(delimeter);
            stringBuilder.append("|");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private int getSum(int[] ints) {
        int sum = 0;
        for (int temp : ints) {
            sum += temp;
        }
        return sum;
    }

    private int[] toInts(String[] split) {
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = new CalculatorElement(split[i]).toInt();
        }
        return ints;
    }

    private boolean isInvalidInput(String inputString) {
        return inputString == null || inputString.isBlank();
    }

    //private


}
