import java.util.*;

public class InterestingDrink{

    public static int binarySearch(int[] arr,int m){
        int left = 0, right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] <= m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Arrays.sort(arr);        
        
        for(int i=0;i<q;i++){
            int m  = sc.nextInt();
            int count = binarySearch(arr, m);
            System.out.println(count);
            
            
        }
    }
}