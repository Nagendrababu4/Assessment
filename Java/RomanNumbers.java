import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int intValue = romanToInt(romanNumeral);
        System.out.println("Integer Value: " + intValue);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int num = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanNumerals.get(s.charAt(i));
            if (value < prevValue) {
                num -= value;
            } else {
                num += value;
            }
            prevValue = value;
        }
        return num;
    }
}