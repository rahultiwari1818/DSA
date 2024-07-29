import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            for(int i=n;i>m;i--){
                System.out.printf("%d ",i);
            }
            for(int i=1;i<=m;i++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
