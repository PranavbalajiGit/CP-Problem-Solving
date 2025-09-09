import java.util.Scanner;

public class A_Don_t_Try_to_Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            System.out.println(minOperations(x, s));
        }
        sc.close();
    }

    static int minOperations(String x, String s) {
        String cur = x;

        for (int ops = 0; ops <= 6; ops++) { // 6 is safe upper bound
            if (cur.contains(s)) {
                return ops;
            }
            cur = cur + cur; // perform operation
        }

        return -1;
    }
}