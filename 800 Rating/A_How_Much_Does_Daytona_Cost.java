
import java.util.Scanner;

public class A_How_Much_Does_Daytona_Cost{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++)
            {
                arr[i] = sc.nextInt();
            }

            boolean found_the_number = false;
            for(int i = 0 ;i < size ; i++)
            {
                if(arr[i] == k)
                {
                    found_the_number = true;
                    break;
                }
            }

            if(found_the_number) System.out.println("YES");
            else System.out.println("NO");

            test--;
        }
    }
}
