

import java.util.*;

public class A_Halloumi_Boxes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noe = sc.nextInt();

        while(noe != 0)
        {
            int size = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++)
            {
                arr[i] = sc.nextInt();
            }

            int[] copy = Arrays.copyOf(arr,size);
            Arrays.sort(arr);

            if(Arrays.equals(arr, copy)|| k > 1)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            noe--;
        }

        sc.close();
        
    }
}