
// Date : 14-11-23
// Doubt Clarification Session - 3
// Pattern Printing

public class Doubt_Session_3 {
    // Increasing Right pattern
    public static void pattern_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Decreasing Left pattern
    public static void pattern_2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // + pattern
    // Logic - Find mid position
    // (n/2)+1 if i starts from 1
    // n/2 if i starts from 0
    public static void pattern_3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        // pattern_1(n);

        // pattern_2(n);
        pattern_3(n);

    }
}
