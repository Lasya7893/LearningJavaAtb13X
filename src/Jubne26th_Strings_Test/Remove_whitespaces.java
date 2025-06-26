package Jubne26th_Strings_Test;

public class Remove_whitespaces {
    public static void main(String[] args) {
        String str = "Hi, How are you? ";
         String str1 = str.replaceAll("\\s+","");
        System.out.println(str1);

    }
}
