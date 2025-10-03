
import java.util.Scanner;

public class A_Twin_Permutations
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

            for(int i = 0 ; i < size ; i++)
            {
                System.out.print((size + 1 - arr[i]) + " ");
            }
            System.out.println();
            
            test--;
        }

        sc.close();
    }
}