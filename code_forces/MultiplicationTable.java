import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int ans = 0;
        if(x == 1){
            System.out.println(1);
        }
        else{
            for(int i=1;i<=n;i++){
                if(x%i == 0 && x/i <= n) ans+=1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
