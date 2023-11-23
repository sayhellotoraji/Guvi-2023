package Sample_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fibonacci_Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long N = 10L;
        // Use arrays cause iterate accepts 3 parameters
        // 1. Initial Value
        // 2. Predicate
        // 3. Unary Operator - Reason for array usage
        int[] arr = new int[] { 0, 1 };
        System.out.println("Fibonacci Numbers:");
        Stream.iterate(arr, f -> new int[] { f[1], f[0] + f[1] })
                .limit(N)
                .map(n -> n[0])
                .forEach(System.out::println);
    }
}
