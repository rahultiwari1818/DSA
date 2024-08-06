import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            
            int n = sc.nextInt();
            int a = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            if(a == n){
                System.out.println("YES");
            }
            else{
                int offline = 0;
                int online = 0;
                for(int i=0;i<k;i++){
                    if(str.charAt(i)=='+'){
                        online++;
                    }
                    else{
                        offline++;
                    }
                }
                
                
            }

            

        }
    }
}