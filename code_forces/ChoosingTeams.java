import java.util.*;
public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        for(int i=0;i<n && arr[i]<=5 ;i+=3){
            if(i+2 < n && arr[i]+k <= 5 &&arr[i+1]+k <= 5 &&arr[i+2]+k <= 5  ) answer++;
        }
        System.out.println(answer);
    }
}
