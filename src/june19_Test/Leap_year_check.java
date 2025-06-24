package june19_Test;

import java.util.Scanner;

public class Leap_year_check {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}
