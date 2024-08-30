import java.util.*;

public class OddDivisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            long n = sc.nextLong();
            if (n % 2 == 1 || (n & (n - 1)) != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}