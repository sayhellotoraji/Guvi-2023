import java.util.*;
public class Main2 {
    public static void main(String[] args) {
       
        int a = 1;
        int b = 2;
        int c = 3;
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        s.remove(((TreeSet<Integer>) s).last());
        

    }
}