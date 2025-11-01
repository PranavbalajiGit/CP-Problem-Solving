
import java.util.Scanner;

public class A_We_Need_the_Zero
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

            int total_xor = 0;
            for(int num : arr)
                total_xor ^= num;
            
            if(size % 2 == 1)
            {
                System.out.println(total_xor);
            }
            else
            {
                if(total_xor == 0)
                    System.out.println(1);
                else
                    System.out.println(-1);
            }
            
            test--;
        }
    }
}