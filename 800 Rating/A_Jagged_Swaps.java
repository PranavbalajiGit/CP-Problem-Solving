import java.util.Scanner;

public class A_Jagged_Swaps{
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

            if(arr[0] == 1) System.out.println("YES");
            else System.out.println("NO");

            test--;
        }
    }
}