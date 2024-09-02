import java.util.*;

public class BalancedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int[] arr = new int[n];
                int sumFirstHalf = 0, sumSecondHalf = 0;
                
                for (int i = 0; i < n / 2; i++) {
                    arr[i] = (i + 1) * 2;
                    sumFirstHalf += arr[i];
                }
                
                for (int i = 0; i < n / 2 - 1; i++) {
                    arr[n / 2 + i] = (i + 1) * 2 - 1;
                    sumSecondHalf += arr[n / 2 + i];
                }
                
                arr[n - 1] = sumFirstHalf - sumSecondHalf;
                
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
