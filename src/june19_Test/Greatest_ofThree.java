package june19_Test;

//import javax.jws.Oneway;
import java.util.Scanner;

public class Greatest_ofThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 != num2 && num1 != num3 && num2 != num3) {
            int greatestNumber = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2>num3? num2 : num3);
            System.out.println("greatest number is " + greatestNumber);
        }
        else {
            System.out.println("please enter unequal numbers");
        }
    }
}
