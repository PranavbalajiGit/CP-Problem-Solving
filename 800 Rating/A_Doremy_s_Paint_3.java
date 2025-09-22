
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class A_Doremy_s_Paint_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            Map <Long , Long> hm = new HashMap<>();

            for(int i = 0 ; i < size ; i++)
            {
                long num = sc.nextLong();
                hm.put(num , hm.getOrDefault(num, 0L) + 1);
            }    
            
            if(hm.size() == 1)
            {
                System.out.println("Yes");
            }
            else if(hm.size() > 2)
            {
                System.out.println("No");
            }
            else
            {
                List<Map.Entry<Long , Long>> entries = new ArrayList<>(hm.entrySet());
                Long freq1 = entries.get(0).getValue();
                Long freq2 = entries.get(1).getValue();
                
                if(freq1 == freq2) System.out.println("Yes");
                else if(size % 2 == 1 && Math.abs(freq1 - freq2) == 1) System.out.println("Yes");
                else System.out.println("No"); 
            }

            test--;
        }

        sc.close();
    }
}

