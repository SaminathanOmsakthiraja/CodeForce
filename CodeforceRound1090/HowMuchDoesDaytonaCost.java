package CodeforceRound1090;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int k = sc.nextInt();
            boolean found = false;
            int[] a = new int[size];
            for(int i = 0; i < size; i++){
                a[i] = sc.nextInt();
                if (a[i]==k)
                    found = true;
            }
            if(found)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}
