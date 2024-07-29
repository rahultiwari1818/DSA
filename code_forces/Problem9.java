import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            
            int n = sc.nextInt();
            int q = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = q;
            for (int i = 0; i < k; i++) {
                if (str.charAt(i) == '+') {
                    count++;
                } else {
                    count--;
                }
            }
            if (count == n) {
                System.out.println("MAYBE");
            } else if (count > n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}