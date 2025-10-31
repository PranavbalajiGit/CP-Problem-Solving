
import java.util.Scanner;

public class A_Array_Coloring{
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

            int count_of_odd = 0;

            for(int i = 0 ; i < size ; i++)
            {
                if(arr[i] % 2 == 1) count_of_odd++;
            }
            
            if(count_of_odd % 2 == 1) System.out.println("NO");
            else System.out.println("YES");
            
            test--;
        }

        sc.close();
    }
}