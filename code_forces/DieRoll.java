import java.util.*;

public class DieRoll {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int m = Math.max(y,w);
        if(m>6){
            System.out.println("0/1");
        }
        else{
            int gcd = gcd(6-m+1,6);;
            System.out.println(((6-m+1)/gcd)+"/"+(6/gcd));
        }
        sc.close();
    }
}
