package Jubne26th_Strings_Test;

import javax.sound.midi.Soundbank;

public class Reverse_MultipleMethods {
    public static void main(String[] args) {
        String str = "HelloWorld";
//commented out other two ways temporarily so that can uncomment the required code

//Reverse inbuilt function
       /* String inbuiltReverse = new StringBuilder(str).reverse().toString();
        System.out.println(inbuiltReverse);*/

//Reverse using loop
       /* String reversed="";
        for (int i = str.length(); i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);*/

//Reverse using recursion
        String reverse = reverse(str);
        System.out.println(reverse);

           }
    public static String reverse(String str1){
        if(str1==null || str1.length()<=1)
        {
            return str1;
        }
        return reverse(str1.substring(1))+str1.charAt(0);
    }
}
