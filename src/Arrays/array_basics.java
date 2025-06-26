package Arrays;

import java.util.Arrays;

public class array_basics {
    public static void main(String[] args) {
        int a =10;
        int[] marks = {90,91,67,87,93,100};
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(marks[5]);
        Arrays.sort(marks);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
//------------------------------------------------------------------
        int[] marks1 = new int[5];
        marks1[0]=39;
        marks1[1] =77;
        marks1[2]=90;
        for (int j = 0; j <marks1.length ; j++) {
            System.out.println(marks1[j]);
        }
//-----------------------------------------------------------------------
        String[] names = new String[3];
        names[0] = "Harry Potter";
        names[1] = "Hermoine Granger";
        names[2] = "Ronald Weasly";
        for (int m = 0; m <names.length ; m++) {
            System.out.println(names[m]);
        }

        }

    }
}
