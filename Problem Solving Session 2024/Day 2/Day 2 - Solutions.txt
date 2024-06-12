Day-2(Pattern programming):
Pyramid Patterns
Alphabet Patterns
Number Patterns
Triangle Patterns
Number Systems
Fibonacci 
Palindromic 
Strong Number 
ArmStrong Number
Factorial etc.
---------------------------------------------------------------------------------------------------------------------------------------------------------
Q1.WAP to print following pattern.
Input:
5
5

Output:
11111
22222
33333
44444
55555


Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



---------------------------------------------------------------------------------------------------------------------------------------------------------
Q2.WAP to print following pattern.
Input:
5
5

Output:
10101
01010
10101
01010
10101


Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(k%2==0)
                System.out.print(0);
                else
                System.out.print(1);
                k++;
            }
            System.out.println();
        }
    }
}




---------------------------------------------------------------------------------------------------------------------------------------------------------
Q3.WAP to print following pattern.
Input:5
Output:
*****
****
***
**
*

Solution:
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


---------------------------------------------------------------------------------------------------------------------------------------------------------
Q4.WAP to print following pattern.
Input:5
Output:
ABCDE
FGHIJ
KLMNO
PQRST
UVWXY

Solution:
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
}



---------------------------------------------------------------------------------------------------------------------------------------------------------
Q5.WAP to print following pattern.
Input:
5
Output:
*****
****
***
**
*

Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



---------------------------------------------------------------------------------------------------------------------------------------------------------
Q6.WAP to print following pattern.
Input:
5
5

Output:
*****
*****
*****
*****
*****

Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
  
            }
            System.out.println();
        }
    }
}



---------------------------------------------------------------------------------------------------------------------------------------------------------
Q7.WAP to print following pattern.
Input:5
Output:
12345
12345
12345
12345
12345

Solution:
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
  
            }
            System.out.println();
        }
    }
}




---------------------------------------------------------------------------------------------------------------------------------------------------------
Q8.WAP to print following pattern.
Input:5
Output:
1*2*3
1*2*3
1*2*3
1*2*3
1*2*3

Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=n;j++){
                if(j%2==0)
                System.out.print("*");
                
                else
                System.out.print(k++);
  
            }
            System.out.println();
        }
    }
}




---------------------------------------------------------------------------------------------------------------------------------------------------------
Q9.Write a program to check whether a given number is prime or not.
Input:17
Output:
17 is a prime number.

Solution:

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean flag = false;
    
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}


---------------------------------------------------------------------------------------------------------------------------------------------------------
Q10.Write a program to check whether a given number is a Harshad number or not.

Input: A single integer representing the number to be checked.

Output: Print "Harshad number" if the input number is a Harshad number, otherwise print "Not a Harshad number

Hint:
A Harshad number  is an integer that is divisible by the sum of its digits. 
For example, 18 is a Harshad number because 1 + 8 = 9 and 18 is divisible by 9.


Solution:

import java.util.*;
    public class Main  
    {  
        public static void main(String[] args) {  
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int rem = 0, sum = 0, n;  
              
            n = num;  
              
            while(num > 0){  
                rem = num%10;  
                sum = sum + rem;  
                num = num/10;  
            }  
              
            if(n%sum == 0)  
                System.out.println(n + " is a harshad number");  
            else  
                System.out.println(n + " is not a harshad number");  
        }  
    }  





---------------------------------------------------------------------------------------------------------------------------------------------------------
