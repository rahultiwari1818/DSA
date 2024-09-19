import java.util.*;
public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(b.substring(0,1)+a.substring(1)+" "+a.substring(0,1)+b.substring(1));
        }
        sc.close();
    }
}

