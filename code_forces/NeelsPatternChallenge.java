import java.util.Scanner;

public class NeelsPatternChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;
            int lastOne = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (lastOne != -1) {
                        boolean isValid = true;
                        for (int j = lastOne + 1; j < i; j++) {
                            if (s.charAt(j) == s.charAt(j - 1)) {
                                isValid = false;
                                break;
                            }
                        }
                        if (isValid) {
                            count += (i - lastOne - 1); // Number of valid substrings
                        }
                    }
                    lastOne = i;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
// unsolved

