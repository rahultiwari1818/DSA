import java.util.*;
public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        int count = 0;
        
        // Add up the most negative values, up to m TV sets
        for(int i = 0; i < m && count < n; i++) {
            if(arr[i] < 0) {
                ans += Math.abs(arr[i]);
                count++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
