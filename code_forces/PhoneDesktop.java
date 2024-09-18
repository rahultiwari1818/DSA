import java.util.*;
public class PhoneDesktop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int screensFor2x2 = (y + 1) / 2;

            int availableX1 = 0;
            if (y > 0) {
                if (y % 2 == 0) {
                    availableX1 = screensFor2x2 * 7;
                } else {
                    availableX1 = (screensFor2x2 - 1) * 7 + 11;
                }
            }

            int remainingX1 = x - availableX1;
            int totalScreens = screensFor2x2;

            if (remainingX1 > 0) {
                int additionalScreens = (remainingX1 + 14) / 15;
                totalScreens += additionalScreens;
            }

            System.out.println(totalScreens);
        }
        sc.close();
    }
}
