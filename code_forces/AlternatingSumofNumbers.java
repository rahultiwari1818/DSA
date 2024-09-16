import java.util.*;
public class AlternatingSumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = 0;
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                if(i%2 == 0){
                    ans+=num;
                }
                else{
                    ans-=num;
                }
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
