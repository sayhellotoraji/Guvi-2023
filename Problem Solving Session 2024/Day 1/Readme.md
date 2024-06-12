Topic:Day-1
Introduction to Basic of Problem solving
Basic of Java and Guvi Code-Kata Platform
Basic of Input/Output Scanner Class
Input/Output
Operator
Control Structure & Decision Making
--------------------------------------------------------------------------------------------------------------------------------------------------------

Q1.Write a program to get a character as input and print its Unicode value. When a character 
is entered,the character itself is not stored. Instead, a numeric value(Unicode value) is stored.
Sample Input :
g
Sample Output:
103

Case 1
Input (stdin)
G
Output (stdout)
71

Case 2
Input (stdin)
B
Output (stdout)
66


Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}



---------------------------------------------------------------------------------------------------------------

Q2.Write a java program to get 2 numbers from the user and swap their values without any loss of data. You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console.
Input format:
First input: an integer
Second input: an integer


Output format:

The output will be integers(swapped values)



Sample Input:
20
10


Sample Output:
10
20

Case 1
Input (stdin)
20
10

Output (stdout)
10
20
Case 2
Input (stdin)
5
10

Output (stdout)
10
5

Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(a+" "+b);
        // Swap using XOR
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("After Swapping");
        System.out.println(a+" "+b);
    }
}



---------------------------------------------------------------------------------------------------------------



Q3.During the Physical Education hour, PT sir has decided to conduct some team games. He wants to split the students in the class into equal-sized teams. 
In some cases, there may be some students who are left out from teams and he wanted to use the left out, students, to assist him in conducting the team 
games. For instance, if there are 50 students in the class and if the class has to be divided into 7 equal-sized teams, 7 students will be there in each 
team and 1 student will be left out. PT sir asks your help to automate this team splitting task. Can you please help him out?
Input Format:

Input consists of 2 integers.

The first integer corresponds to the number of students in the class.

The second integer corresponds to the number of teams.



Output Format:

Output consists of 2 integers.

The first integer corresponds to the number of students in the each team.

The second integer corresponds to the remaining students.



Sample Input:

60

8



Sample Output:

The number of students in each team is 7 and left out is 4

Case 1
Input (stdin)
78
6

Output (stdout)
The number of students in each team is 13 and left out is 0
Case 2
Input (stdin)
40
6

Output (stdout)
The number of students in each team is 6 and left out is 4
Case 3
Input (stdin)
80
3

Output (stdout)
The number of students in each team is 26 and left out is 2

Solution:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_students = sc.nextInt();
        int team_size = sc.nextInt();

        int no_of_teams = no_of_students/team_size;
        int rem_students = no_of_students%team_size;
        
        System.out.println("The number of students in each team is "+ no_of_teams +" and left out is " + rem_students);
    }
}



---------------------------------------------------------------------------------------------------------------

Q4.Ajay, Binoy, and Chandru were very close friends at school. They were very good in Mathematics and they were the pet students of Emily Mam. Their 
gang was known as 3-idiots. Ajay, Binoy, and Chandru live in the same locality. A new student Dinesh joins their class and he wanted to be friends 
with them. He asked Binoy about his house address. Binoy wanted to test Dinesh's mathematical skills. Binoy told Dinesh that his house is at the 
midpoint of the line joining Ajay's house and Chandru's house. Dinesh was puzzled. Can you help Dinesh out? Given the coordinates of the 2 endpoints
of a line (x1,y1) and (x2,y2), write a  program to find the midpoint of the line.
Input Format:

Input consists of 4 integers.

The first integer corresponds to x1 .

The second integer corresponds to y1.

he third integer corresponds to x2.

he fourth integer corresponds to y2.



Output Format:

Refer Sample Input and Output for exact formatting specifications.

[All floating point values are displayed correct to 1 decimal place]



Sample Input:

2

4

10

15



Sample Output:

Binoy's house is located at (6.0,9.5)

Case 1
Input (stdin)
9
6
5
3

Output (stdout)
Binoy's house is located at (7.0,4.5)
Case 2
Input (stdin)
5
4
3
2

Output (stdout)
Binoy's house is located at (4.0,3.0)

Solution:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the coordinates of the first endpoint (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the second endpoint (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculating midpoint
        float midX = (x1 + x2) / 2.0f;
        float midY = (y1 + y2) / 2.0f;

        // Output
        System.out.printf("Binoy's house is located at (%.1f,%.1f)\n", midX, midY);
    }
}



----------------------------------------------------------------------------------------------------------------------------------------------------------------
Q5.Each Sunday, a newspaper agency sells x copies of a certain newspaper for Rs.a per copy. The cost to the agency of each newspaper is Rs.b. 
The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit obtained on Sundays.
Can you please help them out by writing a program to compute the profit given x, a and b.
Input Format:

Input consists of 3 integers --- x, a and b.

X is the number of copies sold, a is the cost per copy and b is the cost the agency spends per copy.



Output Format:

Refer Sample Input and Output for exact formatting specifications.



Sample Input:

1000

2

1



Sample Output:

The profit obtained is Rs.900

Case 1
Input (stdin)
1000
2
1

Output (stdout)
The profit obtained is Rs.900
Case 2
Input (stdin)
300
2
1

Output (stdout)
The profit obtained is Rs.200

Solution:


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int profit = (x*a) - (x*b) - 100;
        
        System.out.println(profit);
    }
}



-------------------------------------------------------------------------------------------------------------------------------------------------------------
Q6.The environmental eco-club has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting 
their amoeba in a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index
is given, write a program to displays the amoeba’s size……??? For Example, The size of the amoeba on month 1, 2, 3, 4, 5, 6, ..will be 0, 1, 1, 2, 3, 5, 8
respectively.
Input format:

The first input containing an integer which denotes the number of the month



Output format:

Print the amoeba size.



Sample Input:

7



Sample Output:

8

Case 1
Input (stdin)
7

Output (stdout)
8

Case 2
Input (stdin)
13

Output (stdout)
144

Case 3
Input (stdin)
4
Output (stdout)
2

Solution:
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int s1=0,s2=1,s3=0;
      if(n==1)
      {
        System.out.print(s1);
      }else if(n==2)
      {
        System.out.print(s2);
      }else
      {
        for(int i=3;i<=n;i++)
        {
          s3=s1+s2;
          s1=s2;
          s2=s3;
        }
        System.out.print(s3);
      }
    }
}




----------------------------------------------------------------------------------------------------------------------------------------------------------
Q7.Lucas Sequence
a = 0, b=0, c=1 are the 1st three terms. All other terms in the Lucas sequence are generated by the sum of their 3 most recent predecessors. 
Write a program to generate the first n terms of a Lucas Sequence.
Input format:
The input containing an integer 'n' which denotes the given number

Output format:

Print the 'n' terms of the Lucas Sequence, separated by a single space. There are no leading or trailing spaces in the output.

Sample Input:

5
Sample Output:
0 0 1 1 2

Case 1
Input (stdin)
10

Output (stdout)
0 0 1 1 2 4 7 13 24 44
Case 2
Input (stdin)
6

Output (stdout)
0 0 1 1 2 4
Solution:


import java.util.Scanner;

public class LucasSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        

        int[] lucas = generateLucasSequence(n);
        for (int i = 0; i < n; i++) {
            System.out.print(lucas[i] + " ");
        }
    }

    public static int[] generateLucasSequence(int n) {
        if (n == 0) {
            return new int[0];
        } else if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 0};
        } else if (n == 3) {
            return new int[]{0, 0, 1};
        }

        int[] lucas = new int[n];
        lucas[0] = 0;
        lucas[1] = 0;
        lucas[2] = 1;
        
        for (int i = 3; i < n; i++) {
            lucas[i] = lucas[i-1] + lucas[i-2] + lucas[i-3];
        }
        return lucas;
    }
}



----------------------------------------------------------------------------------------------------------------------------------------------------------


Q8.Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits 
and the middle digit is divisible by 3.
Input format:

The input containing an integer 'n' which denotes the given number
Output format:

If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".

Sample Input:
791

Sample Output:
Trendy Number

Case 1
Input (stdin)
791

Output (stdout)
Trendy Number
Case 2
Input (stdin)
3

Output (stdout)
Not a Trendy Number
Case 3
Input (stdin)
45

Output (stdout)
Not a Trendy Number

Solution:

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x>99 && x<1000){
            int mid = Character.getNumericValue(String.valueOf(x).charAt(1));
            if(mid%3==0)
                System.out.println("Trendy Number");
            else
                System.out.println("Not a Trendy Number");
        }
        
        else
        System.out.printf("Not a Trendy Number");
        
    }
}




----------------------------------------------------------------------------------------------------------------------------------------------------------
Series:
Q9.Write a program to generate the following series --- 6,11,21,36,56,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

6


Sample Output:

6 11 21 36 56 81

Case 1
Input (stdin)
5

Output (stdout)
6 11 21 36 56
Case 2
Input (stdin)
7

Output (stdout)
6 11 21 36 56 81 111

Solution:
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 6;
        System.out.print(a[0]+" ");
        for(int i=1;i<n;i++){
            a[i] = a[i-1]+(i*5);
            System.out.print(a[i]+" ");
        }
    }
}


----------------------------------------------------------------------------------------------------------------------------------------------------------
Q10.Write a program to generate the first n terms in the series --- 3, 9, 27, 81,....,
Input format:
The input containing an integer which denotes 'n'


Output format:
Print the series and refer the sample output for formatting


Sample Input:
6

Sample Output:
3 9 27 81 243 729

Case 1
Input (stdin)
10

Output (stdout)
3 9 27 81 243 729 2187 6561 19683 59049
Case 2
Input (stdin)
8

Output (stdout)
3 9 27 81 243 729 2187 6561


Solution:
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print((int)Math.pow(3,i)+" ");
        }
    }
}


