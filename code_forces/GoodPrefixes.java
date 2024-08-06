import java.util.*;

public class GoodPrefixes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int prefixSum = 0;
    
            for (int i = 0; i < arr.length; i++) {
                prefixSum += arr[i];
                
                // Check if 2 * a[j] == prefixSum for any j in the current prefix
                for (int j = 0; j <= i; j++) {
                    if (2 * arr[j] == prefixSum) {
                        count++;
                        break; // No need to check further elements, as this prefix is already good
                    }
                }
            }

            
            System.out.println(count);           
        }
    }
    }
