import java.util.*;
public class ContestProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = (a+b)/2;
            System.out.println((c-a)+(b-c));
        }
        
        sc.close();
    }
}
