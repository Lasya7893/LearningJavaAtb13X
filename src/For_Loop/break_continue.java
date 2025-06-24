package For_Loop;

public class break_continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i==5)
            {
                break;
            }
            else {
                System.out.println(i);
            }
        }
        for(int j=0;j<50;j++)
        {
            if(j==5)
            {
                continue;
            }
                System.out.println(j);

        }
    }
}
