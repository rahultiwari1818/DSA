import java.util.*;

public class LittleNikita{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m==n){
                System.out.println("YES");
            }
            else if(m<n){
                System.out.println("NO");
            }
            else{
                if((n%2==0 && m%2==0) || (n%2!=0 && m%2!=0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}