package Sample_Tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

// SYMBOL       VALUE
//   I            1
//   IV           4
//   V            5
//   IX           9
//   X            10
//   XL           40
//   L            50
//   XC           90
//   C            100
//   CD           400
//   D            500
//   CM           900 
//   M            1000

/**
 * Roman To Integer
 * 
 * 1. Iterate over each character of the given string of roman numerals.
 * 
 * 2. Compare the value of the current roman character with its
 * right roman character.
 * 
 * 3. If the current value is greater than or equal to the value of
 * the symbol to the right, add the current character's value to the
 * total variable.
 * 
 * 4. If the current value is less than the value of the symbol to
 * the right, subtract the current character's value from the
 * total variable.
 * 
 */

public class Roman_Addition {
    // Int to Roman Values
    // Use of LinkedHashMap for better storage and retrieval
    // Similar to array functioning
    public static Map<Integer, String> int_to_roman = new LinkedHashMap<>();

    // Roman to Int Values
    public static Map<Character, Integer> roman_to_int = new HashMap<>();

    Roman_Addition() {
        // Int to Roman Values
        int_to_roman.put(500, "D");
        int_to_roman.put(100, "C");
        int_to_roman.put(50, "L");
        int_to_roman.put(10, "X");
        int_to_roman.put(9, "IX");
        int_to_roman.put(5, "V");
        int_to_roman.put(4, "IV");
        int_to_roman.put(1, "I");

        // Roman to Int Values
        roman_to_int.put('I', 1);
        roman_to_int.put('V', 5);
        roman_to_int.put('X', 10);
        roman_to_int.put('L', 50);
        roman_to_int.put('C', 100);
        roman_to_int.put('D', 500);
    }

    // Roman to Integer Conversion
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = roman_to_int.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = roman_to_int.get(s.charAt(i + 1));
                if (s1 >= s2) {
                    total = total + s1;
                } else {
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        return total;
    }

    public String intToRoman(int number) {
        String result = "";

        // Converting keyset to list for easier traversal
        List<Integer> keys = int_to_roman.keySet()
                .stream()
                .collect(Collectors.toList());

        // Traverse from Left to Right
        for (int i = 0; i < keys.size(); i++) {
            int temp = keys.get(i);
            while (number >= temp) {
                result += int_to_roman.get(temp);
                number = number - temp;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        String romanStr1 = sc.nextLine();

        System.out.println("Second Number: ");
        String romanStr2 = sc.nextLine();

        Roman_Addition roman_add = new Roman_Addition();
        int value_1 = roman_add.romanToInt(romanStr1);
        int value_2 = roman_add.romanToInt(romanStr2);
        // System.out.println(value_1);
        // System.out.println(value_2);

        int sum = value_1 + value_2;
        System.out.println("Sum value is: " + sum);

        String result = roman_add.intToRoman(sum);
        System.out.println("Sum in Roman Letter: " + result);

        sc.close();
    }
}