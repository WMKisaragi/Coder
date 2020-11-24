import java.io.*;
import java.util.*;

class Main {

    // Generated by 1.1.7.1 https://github.com/kyuridenamida/atcoder-tools (tips:
    // You use the default template now. You can remove this line by using your
    // custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long[] r = new long[(int) (2)];
        long[] c = new long[(int) (2)];
        for (int i = 0; i < 2; i++) {
            r[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }
        solve(r, c);
    }

    static void solve(long[] r, long[] c) {

        // (a,b)->(c,d) (r[0], c[0])->(r[1],c[2])

        // 必ず3手で移動したい座標に移動出来る
        // TODO: 0手～2手を判定する
        // TODO: 何故かテストケースでWAが出る…

        // 0手：座標完全一致
        if (Arrays.equals(r, c)) {
            System.out.println(0);
            return;
        }

        // 1手：問題文のいずれかの移動
        if (r[0] + c[0] == r[1] + c[1]) {
            System.out.println(1);
            return;
        }
        if (r[0] - c[0] == r[1] - c[1]) {
            System.out.println(1);
            return;
        }
        if (Math.abs(r[0] - r[1]) + Math.abs(c[0] - c[1]) <= 3) {
            System.out.println(1);
            return;
        }

        // 2手：
        // 市松模様で移動するとき
        if ((r[0] + c[0]) % 2 == (r[1] + c[1]) % 2) {
            System.out.println(2);
            return;
        }
        // 3マス以内移動(条件3つ目)を2回くりかえすとき
        if (Math.abs(r[0] - r[1]) + Math.abs(c[0] - c[1]) <= 6) {
            System.out.println(2);
            return;
        }
        // 3マス以内移動＋角駒移動
        if (Math.abs((r[0] + c[0]) - (r[1] + c[1])) <= 3) {
            System.out.println(2);
            return;
        }
        if (Math.abs((r[0] - c[0]) - (r[1] - c[1])) <= 3) {
            System.out.println(2);
            return;
        }

        System.out.println(3);
    }
}
