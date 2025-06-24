package june19_Test;

import java.util.Scanner;

public class Switch_dayOFtheWeek {
    public static void main(String[] args) {
        System.out.println("Enter the week code");
        Scanner scanner = new Scanner(System.in);
        String weekcode = scanner.next();

        switch (weekcode)
        {
            case "sun":
                System.out.println("Sunday");
                break;
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thur":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;

        }
    }
}
