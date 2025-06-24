package If_statment;

import java.util.Scanner;

public class vowels_consonants_pgm {
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        Scanner scanner = new Scanner(System.in);
        char Alphabet = scanner.next().toLowerCase().charAt(0);

        if(Alphabet=='a' || Alphabet=='e' || Alphabet=='i'|| Alphabet=='o' || Alphabet=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}
