import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while (testcase-- > 0){
            String s = sc.next().toLowerCase();
            if (s.equals("yes"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
