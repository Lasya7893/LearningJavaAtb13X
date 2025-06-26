package Jubne26th_Strings_Test;
import java.lang.String;
import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {

        String str = "Hi How are you";
        String[] words = str.trim().split("\\s+");
        System.out.println("Word count in given string is " + words.length);
    }
}
