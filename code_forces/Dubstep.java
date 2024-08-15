import java.util.*;

public class Dubstep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int i=0;
        
        while (i < s.length()) {
            if (i <= s.length() - 3 && s.substring(i, i + 3).equals("WUB")) {
                i += 3;
                if (!ans.endsWith(" ") && ans.length() > 0) {
                    ans += " ";
                }
            } else {
                ans += s.charAt(i);
                i++;
            }
        }
        
        System.out.println(ans.trim());
    }
}