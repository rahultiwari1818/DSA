import java.util.*;
public class AplusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            System.out.println((s.charAt(0)-'0')+(s.charAt(2)-'0'));
        }
    }
}
