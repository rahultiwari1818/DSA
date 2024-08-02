import java.util.*;

public class YogurtSale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            if(m*2 <= s ){
                System.out.println(n*m);
            }
            else{
                if(n%2==0){
System.out.println((n/2)*s);
                }
                else{
                    System.out.println(((n/2)*s)+m);
                }
            }
        }
        
    }
}