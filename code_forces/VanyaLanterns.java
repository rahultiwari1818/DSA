import java.util.*;

public class VanyaLanterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double maxGap = 0;
        for(int i=1;i<n;i++){
            maxGap = Math.max(maxGap, arr[i]-arr[i-1]);
        }
        double maxDist = Math.max(maxGap/2,l-arr[n-1]);
        maxDist = Math.max(arr[0], maxDist);
        System.out.println(maxDist);
    }
}