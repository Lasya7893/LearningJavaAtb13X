package Strings;

public class String_immutability {
    public static void main(String[] args) {
        String name = "Pramod"; // SCP
//        name.toUpperCase();
        name = name.toUpperCase(); // PRAMOD
        System.out.println(name);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
