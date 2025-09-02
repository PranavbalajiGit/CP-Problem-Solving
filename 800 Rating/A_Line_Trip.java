
import java.util.Scanner;


public class A_Line_Trip{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            int x = sc.nextInt();

            size += 2;
            int[] arr = new int[size];

            arr[0] = 0 ;
            arr[size - 1] = x;
            
            int capacity = 0;
            for(int i = 1 ; i < size - 1; i++)
            {
                arr[i] = sc.nextInt();
            }

            for(int i = 1 ; i < size; i++)
            {
                if(i == size - 1) 
                {
                    capacity = Math.max(capacity , (2 * (arr[i] - arr[i - 1])));
                }
                else{
                    capacity = Math.max(capacity , (arr[i] - arr[i -1]));
                }
            }

            System.out.println(capacity);
            test--;
        }
    }
}