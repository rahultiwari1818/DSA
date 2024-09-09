import java.util.*;
public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        int start = 0 , end = n-1;
        while(end < m){
            answer = Math.min(arr[end]-arr[start],answer);
            end++;
            start++;
        }
        
        System.out.println(answer);
    }
}
