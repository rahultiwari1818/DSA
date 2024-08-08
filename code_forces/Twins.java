import java.util.*;

public class Twins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int newSum = 0;
        int answer = 0,ptr = n-1;

        while(ptr >=0 && newSum <= sum-newSum){
            newSum += arr[ptr];
            ptr--;
            answer+=1;
        }



        System.out.println(answer);

    }
}