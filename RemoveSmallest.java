import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while (testcase-- > 0){
            int size = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < size; i++)
                arr.add(sc.nextInt());
            Collections.sort(arr);

            boolean possible = true;

            for (int i = 0; i < size - 1; i++) {
                if (arr.get(i + 1) - arr.get(i) > 1) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}