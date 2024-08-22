import java.util.*;

public class MikishaAndGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total1 = 0, total2 = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m > c) {
                total1 += 1;
            } else if (m < c) {
                total2 += 1;
            }
        }

        if (total1 == total2) {
            System.out.println("Friendship is magic!^^");
        } else if (total1 > total2) {
            System.out.println("Mishka");
        } else {
            System.out.println("Chris");
        }
    }
}
