package june19_Test;

public class PrimeNumbers_1to100 {

        public static void main(String[] args) {
            System.out.println("Prime numbers between 1 and 100 are:");

            for (int number = 2; number <= 100; number++) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                }
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            // Check divisibility up to square root of num
            for (int i = 2; i <= Math.sqrt(num); i+=2) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

