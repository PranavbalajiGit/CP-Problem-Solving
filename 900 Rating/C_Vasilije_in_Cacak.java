
import java.util.Scanner;

public class C_Vasilije_in_Cacak
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            long n = sc.nextInt();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long minSum = (k * (k + 1)) / 2;
            long maxSum = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;

            if(minSum <= x && x <= maxSum)
                System.out.println("YES");
            else
                System.out.println("NO");
            test--;
        }
        sc.close();
    }
}