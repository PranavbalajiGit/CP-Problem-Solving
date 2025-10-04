
import java.util.Scanner;

public class B_Blank_Space
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

            int counter = 0 , maxCount = 0;
            for(int i = 0 ; i < size ; i++)
            {
                if(arr[i] == 1)
                {
                    counter = 0;
                }
                else
                {
                    counter++;
                    maxCount = Math.max(maxCount , counter);
                }
            }
            System.out.println(maxCount);
            test--;
        }

        sc.close();
    }
}