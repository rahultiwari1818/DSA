import java.util.*;
public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b){
                System.out.println(c);
            }
            else if(c==b){
                System.out.println(a);
            }
            else if(c==a){
                System.out.println(b);
            }
        }
    }
}
