import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int ans = 0;
            for(int i=0;i<k-1;i++){
                ans += arr[i] + arr[i]-1;
            }
            System.out.println(ans);

        }
    }

}