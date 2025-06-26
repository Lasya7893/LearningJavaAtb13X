package Jubne26th_Strings_Test;

public class String_Comparison {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "Hello";
        String str3 = "Hello";
        String str4 = new String("heLLo");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
        System.out.println(str3==str4);
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
