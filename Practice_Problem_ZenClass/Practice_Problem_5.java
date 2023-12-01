package Practice_Problem_ZenClass;

import java.util.*;

class Practice_Problem_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        // Switch in Java 14
        // String sizeName = switch(size){
        //     case 40 -> "Small";
        //     case 41 -> "Medium";
        //     case 42 -> "Large";
        // };

        if (size < 40)
            System.out.println("Small");
        else if (size >= 40 && size < 42)
            System.out.println("Medium");
        else if (size >= 42)
            System.out.println("Large");
        else
            System.out.println("Invalid Size");
    }
}