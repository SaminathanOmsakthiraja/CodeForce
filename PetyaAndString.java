import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String F = (sc.next()).toLowerCase();
        String S = (sc.next()).toLowerCase();
        int status = 0;
        for(int i = 0; i < F.length(); i++){
            if(F.charAt(i) < S.charAt(i)){
                status = -1;
                break;
            }
            else if(F.charAt(i) > S.charAt(i)){
                status = 1;
                break;
            }
        }
        System.out.println(status);

        sc.close();
    }
}