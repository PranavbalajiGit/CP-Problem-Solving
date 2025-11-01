

import java.util.Scanner;

public class A_Walking_Master{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- != 0)
        {
            int source_x = sc.nextInt();
            int source_y = sc.nextInt() ;
            int dest_x = sc.nextInt();
            int dest_y = sc.nextInt();

            if(source_y > dest_y)
            {
                System.out.println(-1);
                continue;
            }

            int moves = dest_y - source_y;
            source_x += moves;

            if(source_x < dest_x)
            {
                System.out.println(-1);
                continue;
            }

            moves += (source_x - dest_x);
            System.out.println(moves);
            
        }
        sc.close();
    }
}