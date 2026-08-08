package CodeforceRound1090;

import java.util.Scanner;

public class AleksaAndStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            for(int i = 1; i <= size; i++){
                System.out.print(2 * i - 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
