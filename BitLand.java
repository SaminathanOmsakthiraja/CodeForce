import java.util.Scanner;

public class BitLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        if (testcase == 0){
            System.out.println(0);
            return;
        }
        int x = 0;
        while(testcase-- > 0){
            String bit = sc.next();
            if(bit.charAt(0)=='-' || bit.charAt(2)=='-')
                x = x - 1;
            else if(bit.charAt(0)=='+' || bit.charAt(2)=='+')
                x = x + 1;
        }
        System.out.println(x);

        sc.close();
    }
}
