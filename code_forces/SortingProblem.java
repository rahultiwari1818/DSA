import java.util.*;

public class SortingProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n>m){
                System.out.println(m+" "+n);
            }
            else{
                System.out.println(n+" "+m);
            }
        }
    }
}