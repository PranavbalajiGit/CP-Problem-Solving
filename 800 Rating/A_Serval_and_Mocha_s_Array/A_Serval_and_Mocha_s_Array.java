
import java.util.Scanner;

public class A_Serval_and_Mocha_s_Array
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

            boolean gcd_exist = false;
            for(int i = 0 ; i < size ; i++)
            {
                for(int j = i + 1 ; j < size ; j++)
                {
                    if(gcd(arr[i],arr[j]) <= 2)
                    {
                        gcd_exist = true;
                        break;
                    }
                }
            }

            if(gcd_exist) 
                System.out.println("Yes");
            else
                System.out.println("No");
            
            test--;
        }
    }

    private static int gcd(int a , int b)
    {
        while(a != 0 && b != 0)
        {
            if(a > b) a = a % b;
            else b = b % a;
        }

        return a + b;
    }
}