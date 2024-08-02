import java.util.*;

public class Problem6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                    // System.out.print( (arr[i][j] % (n * m) + 1) +" ");
                }
                // System.out.println();
            }
            if(n==1 && m==1) System.out.println(-1);
            else{
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        System.out.print( (arr[i][j] % (n * m) + 1) +" ");
                    }
                    System.out.println();
                }
            }
           }
    }
}