package TypeCasting;

public class typecasting_12june_task {
    public static void main(String[] args) {
        //implicit casting Widening
        int A = 10;
        double B = A;
        System.out.println(A);
        System.out.println(B);

        //Explicit casting narrowing
        double C = 33.45;
        int D = (int) C;
        System.out.println(C);
        System.out.println(D);

        //char to ASCII
        char character = 'E';
        int ASCII = (int)character;
        System.out.println(character);
        System.out.println(ASCII);

        //division quotient to int
        int a = 10, b=3;
        int q = (int)(a/b);
        System.out.println(q);

    }
}
