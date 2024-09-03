import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        boolean shouldConvert = true;

        // Check if the entire string or all except the first character are uppercase
        boolean allUpper = s.equals(s.toUpperCase());
        boolean firstLowerRestUpper = s.length() > 1 &&
                                      Character.isLowerCase(s.charAt(0)) &&
                                      s.substring(1).equals(s.substring(1).toUpperCase());

        if (allUpper || firstLowerRestUpper) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) {
                    ans.append(Character.toLowerCase(c));
                } else {
                    ans.append(Character.toUpperCase(c));
                }
            }
        } else {
            ans.append(s);
        }

        System.out.println(ans.toString());
        sc.close();
    }
}
