import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weigh = sc.nextInt();
        boolean divide = (weigh % 2 == 0);
        if(divide && weigh > 2)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}