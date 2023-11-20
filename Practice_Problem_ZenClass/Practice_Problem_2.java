package Practice_Problem_ZenClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Practice_Problem_2 {
    // Using HashSet
    public static void method_1(int[] a) {
        Set<Integer> s = new HashSet<>();
        for (int num : a)
            s.add(num);
        System.out.println(s);
    }

    public static void method_2(List<Integer> list){
        list.stream().distinct().forEach(System.out::print);
    }

    public static void main(String[] args) {
        int array_1[] = { 1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };
        method_1(array_1);

        // int a[] = { 1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };
        Integer array_2[] = { 1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };

        List<Integer> list = Arrays.asList(array_2);

        method_2(list);

    }
}