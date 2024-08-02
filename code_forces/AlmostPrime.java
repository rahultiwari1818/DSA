import java.util.*;

public class AlmostPrime{

    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    if(isPrime(j))
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count == 2){
                answer++;
            }
        }
        System.out.println(answer);

    }
}