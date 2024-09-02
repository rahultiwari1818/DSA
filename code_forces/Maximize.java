import java.util.*;

public class Maximize{

    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int x = sc.nextInt();
            int max = 0;
            int temp = x-1;
            while(temp >= 1){
                max = Math.max(max, gcd(temp,x));
                temp--;
            }
            System.out.println(max);
        }
        sc.close();
    }
}