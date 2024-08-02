import java.util.*;

public class Rudolf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = true;

            int i=1;

            while(i<n){
                if(arr[i-1]==0 && arr[i] > 0){
                    i+=2;
                }
                else if(arr[i-1]==0 && arr[i]<0){
                    flag = false;
                    break;
                } 
                else{
                    arr[i-1]-=1;
                    arr[i]-=2;
                    arr[i+1]-=1;
                }
            }

            for(int num : arr){
                if(num>0){
                    flag = false;
                    break;
                }
            }
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}