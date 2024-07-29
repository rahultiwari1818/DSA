import java.util.*;

public class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[n-1]!=arr[n-2]){
                System.out.println("YES");
            }
            else{
                int mx = arr[n-1];
                int count = 0;
                for(int i=n-1;i>=0;i--){
                    if(mx == arr[i]){
                        count+=1;
                    }
                    else{
                        break;
                    }
                }
                if(count%2==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}