package Strings;

public class String_interviewQ {
    public static void main(String[] args) {
        String name = "Pramod";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());

        //--------------------------------------------------
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // SCP | OA
        // 1 | 3 -> 4
        //---------------------------------------------------------

        String st1 = "Hello";
        String st4 = "Hello"; // SCP -> 1


        String st2 = new String("Hello"); // OA
        String st3 = new String("Hello");
        String st5 = new String("hello"); //  OA = 3

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(st1 == st3);
        System.out.println(st1 == st2);
        System.out.println(st2 == st3);

        System.out.println(st1 == st4);
        System.out.println(st3 == st5);

        // equals ( content) -> value

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st3.equals(st5));
        System.out.println(st3.equalsIgnoreCase(st5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value
    }
}
