import java.util.*;
// Unsolved
public class ContestProb4 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int ans = 0;
            int n = sc.nextInt();
            int arr[][] = new int[n+1][2];
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                
                arr[x][0] = 1; 
                arr[x][1] = sc.nextInt();
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
