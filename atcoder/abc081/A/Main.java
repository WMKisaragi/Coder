import java.io.*;
import java.util.*;

class Main {

    // Generated by 1.1.7.1 https://github.com/kyuridenamida/atcoder-tools (tips:
    // You use the default template now. You can remove this line by using your
    // custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        // Failed to predict input format
        int a;
        a = sc.nextInt();

        int hundred = a / 100;
        int ten = a % 100 / 10;
        int one = a % 100 % 10 / 1;

        System.out.println(hundred + ten + one);
    }

}
