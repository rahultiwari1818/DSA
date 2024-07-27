import java.util.*;

/**
 * Problem2
 */
public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int[] arr = new int[3];

            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            int ops = 5;
            while (ops > 0) {
                ops -= 1;
                arr[0]+=1;
                Arrays.sort(arr);

            }
            System.out.println(arr[0] * arr[1] * arr[2]);
        }
    }
}