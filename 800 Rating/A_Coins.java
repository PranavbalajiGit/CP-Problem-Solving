
import java.util.*;

public class A_Coins
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            long n = sc.nextLong();    /*Since the Range of n and k is close to 10^18 keep it long */
            long k = sc.nextLong();

            if(n % 2 == 0 || (n - k) % 2 == 0)
                System.out.println("YES");
            else 
                System.out.println("NO");
            test--;
        }
    }
}