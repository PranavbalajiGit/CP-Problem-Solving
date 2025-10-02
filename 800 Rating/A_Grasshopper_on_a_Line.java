
import java.util.Scanner;

public class A_Grasshopper_on_a_Line
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            int x = sc.nextInt();
            int k = sc.nextInt();

            if(x % k != 0)
            {
                System.out.println(1 + "\n" + x);
            }
            else
            {
                System.out.println(2 + "\n" + (x - 1) + " " + 1);
            }
            test--;
        }

        sc.close();
    }
}