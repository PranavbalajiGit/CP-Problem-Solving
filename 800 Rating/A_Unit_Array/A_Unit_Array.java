
import java.util.Scanner;

public class A_Unit_Array
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

            int pos_count = 0 , neg_count = 0;
            for(int a : arr)
            {
                if(a > 0) pos_count++;
                else neg_count++;
            }

            int operations = 0;
            while(pos_count < neg_count || neg_count % 2 == 1)
            {
                pos_count++;
                neg_count--;
                operations++;
            }

            System.out.println(operations);
            test--;
        }

        sc.close();
    }
}