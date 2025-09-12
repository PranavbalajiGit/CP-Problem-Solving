
import java.util.Scanner;

public class A_Ambitious_Kid{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = Integer.MAX_VALUE;
        for(int i = 0 ; i < size ; i++)
        {
            if(arr[i] >= 0 && arr[i] < result) result = arr[i];
            else if(arr[i] < 0 && Math.abs(arr[i]) < result) result = Math.abs(arr[i]); 
        }

        System.out.println(result);
    }
}