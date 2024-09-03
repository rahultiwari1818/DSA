import java.util.*;

public class ContestProb2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            for (int i = n - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print((arr[i].indexOf("#") + 1) + " ");
                } else {
                    System.out.print((arr[i].indexOf("#") + 1));
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
