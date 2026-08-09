package CodeforceRound1090;

import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long min = (long) k * (k + 1) / 2;
            long max = (long) k * (2 * n - k + 1) / 2;

            if (x >= min && x <= max)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}