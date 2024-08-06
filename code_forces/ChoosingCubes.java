import java.util.*;

public class ChoosingCubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr,Collections.reverseOrder());
            f--;
            k--;
            if(arr[k] > arr[f]){
                System.out.println("NO");
            }
            else if(arr[k]<arr[f]){
                System.out.println("YES");
            }
            else{
                if(k==n-1 || arr[k+1] < x){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
        }
    }
}