package Operators;

public class Increment_Decrement_13June_task {
    public static void main(String[] args) {
        //P1
        int a =5;
        int b = a++;
        System.out.println("a:" + a + " b:" + b );

        //P2
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        //P3
        int y = 5;
        System.out.println(y++ + ++y);

        //P4
        int x = 5;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        //P5
        int A = 5;
        int B = A++ + ++A;
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        //P6
        int n = 5;
        int m = n++ + ++n + n++ + ++n;
        System.out.println("n = " + n + ", m = " + m);
    }
}
