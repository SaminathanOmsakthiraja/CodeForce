import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++){
            String s = sc.next();
            if(s.length() <= testcases){
                System.out.println(s);
                continue;
            }
            System.out.println(s.charAt(0) +""+ (s.length()-2) +""+ s.charAt(testcases-1));
        }
        sc.close();
    }
}