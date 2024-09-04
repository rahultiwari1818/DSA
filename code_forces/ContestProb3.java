import java.util.*;

public class ContestProb3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int a=0,b=0,f1=0,f2=0;
            if(x%k!=0){
               a+=(x/k);
               a++;
               f1=1;
            }
            else{
                a+=(x/k);
            }
            if(y%k!=0){
               b+=(y/k);
               b++;
               f2=1;
            }
            else{
                b+=(y/k);
            }
            int ans = Math.max(a,b)*2;
            if(f1==0 && f2 == 0){
                ans-=1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
