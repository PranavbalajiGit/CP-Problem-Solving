
import java.util.Scanner;

public class A_Jellyfish_and_Undertale
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while(test != 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long[] arr = new long[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = sc.nextInt();

            long maxTime = b;
            for(int i = 0 ; i < n ; i++)
            {
                maxTime += Math.min(arr[i], a - 1);
            }

            System.out.println(maxTime);
            test--;
        }
        sc.close();
    }
}