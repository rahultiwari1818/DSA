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
                }
            }
            if(m==1 && n==1){
                System.out.println(-1);
            }
            else{
                if(m==1){
                    if(n%2==0){
                        for(int i=0;i<n;i++){
                            System.out.println(arr[n-i-1][0]);
                        }
                    }
                    else{
                        for(int i=0;i<n-1;i++){
                                int temp = arr[i+1][0];
                                arr[i+1][0]=arr[i][0];
                                arr[i][0] = temp;
                                System.out.println(arr[i][0]);
                        }
                        System.out.println(arr[n-1][0]);
                        System.out.println(arr[n-2][0]);
                    }
                }
                else{
                    for(int i=0;i<n;i++){
                        for(int j=0;j<m-1;j++){
                            int temp = arr[i][j+1];
                            arr[i][j+1]=arr[i][j];
                            arr[i][j] = temp;
                            System.out.print(arr[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println(arr[i][m-1]);
                        // System.out.print(" ");
                    }
                }
            }
        }
    }
}