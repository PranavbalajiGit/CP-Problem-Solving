
import java.util.ArrayList;
import java.util.Scanner ;

public class A_United_We_Stand
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

            // int max = Arrays.stream(arr).max().getAsInt();

            int max = 0 ;
            for(int num : arr) 
            {
                if(num > max) max = num;
            }

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for(int i = 0 ; i < size ; i++)
            {
                if(arr[i] == max) c.add(arr[i]);
                else b.add(arr[i]);
            }

            if(b.size() == 0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(b.size() + " " + c.size());
                for(int num : b)
                {
                    System.out.print(num + " ");
                }
                System.out.println();

                for(int num : c)
                {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            test--;
        }
        sc.close();
    }
}