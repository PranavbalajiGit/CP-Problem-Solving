
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_Sequence_Game{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            int[] b = new int[size];

            for(int i = 0 ; i < size ; i++)
            {
                b[i] = sc.nextInt();
            }

            List<Integer> res = new ArrayList<>();
            res.add(b[0]);
            for(int i = 1 ; i < size; i++)
            {
                if(b[i] >= b[i-1]) res.add(b[i]);
                else
                {
                    res.add(b[i]);
                    res.add(b[i]);
                }
            }
            
            System.out.println(res.size());
            for(int i = 0 ; i < res.size() ; i++)
            {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();

            test--;
        }

        sc.close();
    }
}