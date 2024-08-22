import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();
        boolean[] flag = new boolean[26];
        for(int i=0;i<s.length();i++){
            flag[s.codePointAt(i)-97] = true;
        }
        for(boolean var : flag){
            if(!var){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
