import java.util.*;

public class IqTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int odds=0,evens=0;
        int evenIdx = -1;
        int oddIdx = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){evens++; evenIdx=i+1;}
            else {odds++; oddIdx=i+1;}
        }
        if(odds >  evens){
            System.out.println(evenIdx);
        }
        else{
            System.out.println(oddIdx);
        }
        sc.close();
    }
}