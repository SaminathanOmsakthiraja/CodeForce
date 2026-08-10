import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt();
            dragons[i][1] = sc.nextInt();
        }

        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] dragon : dragons) {
            int strength = dragon[0];
            int bonus = dragon[1];

            if (s <= strength) {
                System.out.println("NO");
                return;
            }

            s += bonus;
        }

        System.out.println("YES");

        sc.close();
    }
}