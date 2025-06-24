package june19_Test;

import java.util.Scanner;

public class positive_negative_zero {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String Integer_type = input==0? "Zero" : (input>0? "Positive" : "Negative");
        System.out.println(Integer_type);
    }
}
