package Jubne26th_Strings_Test;

public class String_immutability {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World");
        System.out.println(str);
        String str1 = str.concat(" World");
        System.out.println(str1);

    }
}
