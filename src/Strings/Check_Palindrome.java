package Strings;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String reverse = new String();
        for (int i = input.length()-1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (reverse.equalsIgnoreCase(input)) {
            System.out.println(input +" is palindrome");
        }
        else{
            System.out.println(input +" is not palindrome");
        }
    }
    /*static String reverseStringSB(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();*/
}
