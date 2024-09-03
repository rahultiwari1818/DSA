import java.util.*;

public class ContestProb3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int a = (x + k - 1) / k; 
            int b = (y + k - 1) / k;
            System.out.println(a+b+1);
        }
        sc.close();
    }
}
