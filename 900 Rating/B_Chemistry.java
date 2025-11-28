
import java.util.Scanner;

public class B_Chemistry
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test != 0)
        {
            int size = sc.nextInt();
            int k = sc.nextInt();

            String word = sc.next();

            int[] freqWord = new int[26];
            for(int i = 0 ; i < size ; i++)
            {
                //Mentioned all inputs are lowercase letters 
                freqWord[word.charAt(i) - 'a']++;
            }

            int odd_occurences = 0;
            for(int i = 0 ; i < 26 ; i++)
            {
                odd_occurences += freqWord[i] % 2;
            }

            if(odd_occurences > k + 1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

            test--;
        }
    }
}