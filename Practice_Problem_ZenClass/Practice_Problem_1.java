package Practice_Problem_ZenClass;

import java.util.Arrays;
import java.util.List;

// 16-11-23
// Print pallindrome strings 

public class Practice_Problem_1 {
    public static void pallindrome(String[] arr) {
        List<String> pallindromeList = Arrays.asList(arr);
        pallindromeList.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String arr[] = new String[] { "madam", "pen", "wow", "no" };
        pallindrome(arr);
    }
}


