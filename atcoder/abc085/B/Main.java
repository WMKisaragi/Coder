import java.io.*;
import java.util.*;

class Main {

    // Generated by 1.1.7.1 https://github.com/kyuridenamida/atcoder-tools (tips:
    // You use the default template now. You can remove this line by using your
    // custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] d = new long[(int) (N)];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextLong();
        }
        solve(N, d);
    }

    static void solve(long N, long[] d) {
        ArrayList<Long> v = new ArrayList<>();
        boolean notOverlap = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < v.size(); j++) {
                if (d[i] == v.get(j)) {
                    notOverlap = false;
                    break;
                }
            }
            if (notOverlap) {
                v.add(d[i]);
            }
            notOverlap = true;
        }
        System.out.println(v.size());
    }
}
