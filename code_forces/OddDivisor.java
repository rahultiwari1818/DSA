import java.util.*;

public class OddDivisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            long n = sc.nextLong();
            boolean flag = false;
            for(long i=2;i<=n;i++){
                if(i%2 != 0 && n%i==0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}