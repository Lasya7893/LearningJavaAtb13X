package june19_Test;

import java.util.Scanner;

public class Mul_nestedLoops {
    public static void main(String[] args) {
        // Outer loop for rows (numbers 1 to 10)
        for (int i = 1; i <= 10; i++) {
            // Inner loop for columns (multiplying i by 1 to 10)
            for (int j = 1; j <= 10; j++) {
                // Print multiplication result with formatting
                System.out.print(i * j + "\t");  // Tab for spacing
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
