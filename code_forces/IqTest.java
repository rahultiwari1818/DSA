import java.util.*;

public class IqTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int odds=0,evens=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)evens++;
            else odds++;
        }
        System.out.println(Math.abs(evens-odds));
    }
}