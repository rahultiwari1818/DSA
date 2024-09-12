import java.util.*;
public class Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((Math.max(a, b)-a) + Math.max(a, b)-b);
        }
        sc.close();
    }
}
