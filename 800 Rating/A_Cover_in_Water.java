import java.util.Scanner;

public class A_Cover_in_Water{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt(); // No of test Cases

        while(test != 0)
        {
            int size = sc.nextInt();

            char[] cells = sc.next().toCharArray();

            boolean consecutive_exist = false;
            int empty_cells = 0;

            for(int i = 0 ; i < size ; i++)
            {
                if(cells[i] == '.' && i + 1 < size && cells[i + 1] == '.'  && i + 2 < size && cells[i + 2] == '.')
                {
                    consecutive_exist = true;
                    break;
                }
                if(cells[i] == '.')
                {
                    empty_cells++;
                }
            }

            if(consecutive_exist) System.out.println(2);
            else System.out.println(empty_cells);

            test--;
        }
    }
}