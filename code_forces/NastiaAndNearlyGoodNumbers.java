import java.util.*;
public class NastiaAndNearlyGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            if(b==1 || (a*b+a*(b-1)) >= Math.pow(10, 18)  || (a*b+a*(b-1)) <0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(a*b+" "+(a*(b-1))+" "+(a*b+a*(b-1)));
            }
        }
        sc.close();
    }
}
