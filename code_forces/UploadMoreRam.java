import java.util.*;
public class UploadMoreRam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else {
                long totalSeconds = 1L + (long)(n - 1) * k;
                System.out.println(totalSeconds);
            }
        }
        sc.close();
    }
}
