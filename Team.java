import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contest = sc.nextInt();
        int count = 0;
        while (contest != 0) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();
            if((petya + vasya + tonya) >= 2)
                count++;
            contest--;
        }
        System.out.println(count);

        sc.close();
    }
}
