import java.util.*;
public class BalancedRound {
    public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                int count = 0;
                
                for(int i=1;i<n;i++){
                    if(Math.abs(arr[i-1]-arr[i]) > k ){
                        count++;
                    }
                }
                System.out.println(count);
            }
            sc.close();
    }
}
