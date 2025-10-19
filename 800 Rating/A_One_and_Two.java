
import java.util.Scanner;

public class A_One_and_Two
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

            int count_2 = 0;
            for(int num : arr)
            {
                if(num == 2) count_2++;
            }
            
            if(count_2 % 2 == 1)
                System.out.println(-1);
            else
            {
                int left_count = 0;
                for(int k = 0 ; k < size ; k++)
                {
                    if(arr[k] == 2)
                        left_count++;

                    if(left_count == count_2 - left_count)
                    {
                        System.out.println(k+1);
                        break;
                    }
                }
            }

            test--;
        }
    }
}