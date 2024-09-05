import java.util.*;
public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = {1, 11, 111, 1111}; 
        while(t-- > 0){
            int x = 1,ptr=0;
            int n = sc.nextInt();
            int ans = 0;
            while(x * arr[ptr] != n){

                ans+=(ptr+1);
                if(ptr == 3){
                    ptr = 0;
                    x++;
                }
                else{
                    ptr++;
                }

            }
            ans+=(ptr+1);
            System.out.println(ans);

        }
        sc.close();
    }
}
