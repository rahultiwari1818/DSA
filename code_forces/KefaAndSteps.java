import java.util.*;

public class KefaAndSteps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxLen = 0,start=0,i=0;
        for( i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                maxLen = Math.max(i-start, maxLen);
                start = i;
            }
        }
        maxLen = Math.max(i-start, maxLen);
        System.out.println(maxLen);
    }
}