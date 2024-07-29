import java.util.*;

public class Problem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k == 0){
                System.out.println(0);
            }
            else{
                int count = 1;
                k-=n;
                n-=1;
                while (n > 0 && k > 0 ) {
                    if(k>0){
                        count++;
                        k-=n;
                    }        
                    if(k>0){
                        count++;
                        k-=n;
                    }                    
                    n--;
                }
                System.out.println(count);
            }
        }
    }
}
