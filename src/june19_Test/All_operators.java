package june19_Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class All_operators {
    public static void main(String[] args) {
        System.out.println("Enter two integers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int marks = scanner.nextInt();
        String result = marks > 35 ? "Pass" : "Fail" ;
        System.out.println("Sum is " + (a+b));
        System.out.println("Diff is " + (a-b));
        System.out.println("Multiplication is " + (a*b));
        System.out.println("quotient is " + (a/b));
        System.out.println("Modulus is " + (a%b));
        System.out.println("Increment is " + ++a);
        System.out.println("Decrement is " + --b);
        System.out.println("Result is " + result );
        System.out.println("Addition " + (a+=10));
        System.out.println("Subtraction " + (b-=2));

    }
}
