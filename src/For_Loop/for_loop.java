package For_Loop;

public class for_loop {
    public static void main(String[] args) {
        //For loop >> ICU >> Initialisation , Condition, Updation(increment/decrement)
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        for(int j=0; j>1; j++) // will not even run once
        {
            System.out.println(j);
        }
        System.out.println("END");
        for(int m=0;;m++) //infinite loop
        {
            System.out.println(m);
        }

    }
}
