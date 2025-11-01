import java.util.Scanner;
public class A_Game_with_Integers{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();

        while(test != 0)
        {
            int num = sc.nextInt();
            if(num % 3 == 0)
            {
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
            test--;
        }

        sc.close();
    }
}