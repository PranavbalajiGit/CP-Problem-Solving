
import java.util.Scanner;

public class A_Extremely_Round
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            int n = sc.nextInt();
            int ans = 0;

            while(n > 9)
            {
                n /= 10;
                ans += 9;
            }

            System.out.println(ans + n);
            test--;
        }

        sc.close();
    }
}