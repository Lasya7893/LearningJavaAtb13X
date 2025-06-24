package june19_Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the integers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Enter the function");
        String function = scanner.next();

        switch (function)
        {
            case "sum":
                System.out.println("Sum is " + (num1+num2));
                break;
            case "difference":
                System.out.println("Difference is " + (num1-num2));
                break;
            case "multiplication":
                System.out.println("Multiplication is " + (num1*num2));
                break;
            case "division":
                System.out.println("Quotient is " + (num1/num2));
                break;
        }
    }
}
