

import java.util.Arrays;
import java.util.Scanner;

public class A_Make_it_Beautiful
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

            Arrays.sort(arr);
            int max = arr[size - 1];
            int min = arr[0];

            if(max == min)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                System.out.print(max + " ");
                for(int i = 0 ; i < size -1 ; i++)
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            test--;
        }

        sc.close();
    }
}