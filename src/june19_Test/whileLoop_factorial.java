package june19_Test;

import java.util.Scanner;

public class whileLoop_factorial {
    public static void main(String[] args) {
        System.out.println("Enter a positive number");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int i =1;
        int factorial = 1;
        if(Number<0)
        {
            System.out.println("Factorial is not defined for negative integers");
        }
        else {
            while (i <= Number) {
                factorial *= i;
                i++;
            }
            System.out.println(factorial);
        }
    }
}
