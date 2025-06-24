package task_16june;

import java.util.Scanner;

public class triangle_classification {
    public static void main(String[] args) {
        System.out.println("enter the triangle sides");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        //int _side = 3;

            if (side1 == side2 && side2 == side3) {
                System.out.println("It is an equilateral triangle");
            } else if ((side1 == side2 && side1 != side3) || (side1 == side3 && side1 != side2) || (side2 == side3 && side2 != side1)) {
                System.out.println("It is an Isoceles triangle");
            } else {
                System.out.println("It is a scalene triangle");
            }
        }

}
