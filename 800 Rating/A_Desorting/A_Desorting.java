
import java.util.Scanner;

public class A_Desorting{
    public static void main(String[] args) {
        
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

            int operations = Integer.MAX_VALUE;
            for(int i = 0 ; i < size - 1; i++)
            {
                if(arr[i] <= arr[i + 1])
                {
                    int d = arr[i + 1] - arr[i];
                    operations = Math.min(operations , (d/2)+1);
                }
                else
                {
                    operations = 0;
                    break;
                }
            }

            System.out.println(operations);
            test--;
        }

        sc.close();
    }
}