package For_Loop;

public class Find_even_numbers {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even numbers ->" + i);
            }
            else
            {
                System.out.println("Odd numbers -> " + i);
            }
        }
    }
}
