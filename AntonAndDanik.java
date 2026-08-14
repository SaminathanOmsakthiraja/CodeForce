import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        int D = 0, A = 0;
        for(char c : ch){
            if (c == 'A') A++;
            else D++;
        }
        if(A == D) System.out.println("Friendship");
        else if(A > D) System.out.println("Anton");
        else System.out.println("Danik");

        sc.close();
    }
    
}
