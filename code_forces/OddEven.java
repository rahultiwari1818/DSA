import java.util.*;

public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long m;
        if(n%2 == 0) m = n/2;
        else m = (n/2)+1;
        if(k<=m){
            System.out.println((k*2)-1);
        }
        else{
            k-=m;
            System.out.println((k*2));
        }
    }
}