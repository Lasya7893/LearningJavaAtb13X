package StringBuilder_StringBuffer;

public class Stringbuilder_stringbuffer {
    public static void main(String[] args) {
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");



        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        //-----------------------------------------

        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);


        System.out.println(stringBuffer.reverse());

        String st1 = "Hello";
        String s2 = " World!";
        String s3 = st1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(st1);

        //---------------------------------------------
        StringBuilder SB = new StringBuilder("Hello");
        SB.append(" World"); // Appends text
        SB.reverse();
        System.out.println(SB);
        //---------------------------------------------
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
