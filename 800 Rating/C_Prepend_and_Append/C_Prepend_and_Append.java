
import java.util.Scanner;

public class C_Prepend_and_Append 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test != 0)
        {
            int size = sc.nextInt();
            String s = sc.next();

            int left = 0 , right = size - 1;

            while(left <= right)
            {
                if(s.charAt(left) == s.charAt(right))
                    break;
                size -= 2;
                left++;
                right--;
            }

            System.out.println(size);
            test--;
        }

        sc.close();
    }    
}
