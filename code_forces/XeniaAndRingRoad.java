import java.util.*;
public class XeniaAndRingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        long ans = arr[0]-1;
        for(int i=1;i<m;i++){
            if(arr[i] < arr[i-1]){
                ans += (n-arr[i-1]+arr[i]);
            }
            else  if(arr[i] > arr[i-1]){
                ans += (arr[i]-arr[i-1]);
            }
        }
        System.out.println(ans);

    }
}
