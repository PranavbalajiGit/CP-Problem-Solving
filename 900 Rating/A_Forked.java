
import java.util.*;

public class A_Forked{

    static int[] dx = {1 , -1 , -1 , 1};
    static int[] dy = {1 , 1 , -1 , -1};
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int Kleft = sc.nextInt();
            int Kright = sc.nextInt();

            int Qleft = sc.nextInt();
            int Qright = sc.nextInt();
            
            Set<Pair> Kpair = new HashSet<>();
            Set<Pair> Qpair = new HashSet<>();

            for(int i = 0 ; i < 4 ; i++)
            {
                Kpair.add(new Pair(Kleft + (dx[i] * a) , Kright + (dy[i] * b)));
                Kpair.add(new Pair(Kleft + (dx[i] * b) , Kright + (dy[i] * a)));

                Qpair.add(new Pair(Qleft + (dx[i] * a) , Qright + (dy[i] * b)));
                Qpair.add(new Pair(Qleft + (dx[i] * b) , Qright + (dy[i] * a)));
            }

            int ans = 0;
            for(Pair pos : Kpair)
            {
                if(Qpair.contains(pos))
                {
                    ans++;
                }
            }

            System.out.println(ans);
            test--;
        }

        sc.close();
    }

    static class Pair {
		long x, y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair pair = (Pair) o;
			return x == pair.x && y == pair.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
}