
import java.util.Scanner;

public class A_Everybody_Likes_Good_Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++)
            {
                arr[i] = sc.nextInt();
            }

            int ans = 0;

            for(int i = 0 ; i < size - 1 ; i++)
            {
                if((arr[i] % 2) == (arr[i+1] % 2))
                    ans++;
            }

            System.out.println(ans);
            test--;
        }
    }
}