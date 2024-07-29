import java.util.*;

public class Problem7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            if(n<=3){
                System.out.println(n);
            }
            else{
                System.out.println(2);
            }
        }
    }
}