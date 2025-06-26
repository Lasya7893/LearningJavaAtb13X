package Jubne26th_Strings_Test;

public class check_String_isPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
       // String str = "race a car"; //incase want to check with different string
        String NoSpace= str.replaceAll("\\s+","");
        System.out.println(NoSpace);
        String NoPunct = NoSpace.replaceAll("[\\p{Punct}]","");
        System.out.println(NoPunct);
       // String reverse = new StringBuilder(NoPunct).reverse().toString();// using inbuilt reverse
       String reversed ="";
        for (int i = NoPunct.length()-1; i >=0 ; i--) {
             reversed = reversed + NoPunct.charAt(i);
        }
        System.out.println(reversed);
        if(reversed.equalsIgnoreCase(NoPunct))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }


    }
}
