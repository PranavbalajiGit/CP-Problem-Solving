
import java.util.Scanner;

public class C_Target_Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        final int[][] score = {
                                {1,1,1,1,1,1,1,1,1,1},
                                {1,2,2,2,2,2,2,2,2,1},
                                {1,2,3,3,3,3,3,3,2,1},
                                {1,2,3,4,4,4,4,3,2,1},
                                {1,2,3,4,5,5,4,3,2,1},
                                {1,2,3,4,5,5,4,3,2,1},
                                {1,2,3,4,4,4,4,3,2,1},
                                {1,2,3,3,3,3,3,3,2,1},
                                {1,2,2,2,2,2,2,2,2,1},
                                {1,1,1,1,1,1,1,1,1,1}
                               };
        

        while(test != 0)
        {
            char[][] mark = new char[10][10];

            for(int i = 0 ; i < 10 ; i++)
            {
                mark[i] = sc.next().toCharArray();
            }

            int total_score = 0;
            for(int i = 0 ; i < 10 ; i++)
            {
                for(int j = 0 ; j < 10 ; j++)
                {
                    if(mark[i][j] == 'X')
                    {
                        total_score += score[i][j];
                    }
                }
            }

            System.out.println(total_score);
            test--;
        }
    }
}
