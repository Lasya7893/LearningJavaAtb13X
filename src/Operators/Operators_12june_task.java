package Operators;

import java.util.Scanner;

public class Operators_12june_task {
    public static void main(String[] args) {
       //max num using ternary operator
        int A = 10, B = 20 ;
        int max_num = (A>B)? A : B;
        System.out.println("Maximum number is " + max_num);

        //Even or Odd using ternary operator
        int num = 23;
        String EorO = (num%2==0) ? "Even" : "Odd" ;
        System.out.println("The number is " + EorO);

        //Grade calculation using nested ternary operator
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        String result = (marks<40) ? "Fail" : (marks>=40 && marks < 60 ? "C" : (marks>= 60&& marks < 75 ? "B" : (marks>= 75 && marks<90 ? "A" : "A+"))) ;
        System.out.println("The Result is " + result);

    }
}
