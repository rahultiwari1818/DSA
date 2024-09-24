import java.util.Scanner;

public class NeelsPatternChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            for(int i=0;i<n-2;i++){
                int j = i;
                if(s.charAt(i)=='0') continue;
                while(i < n-2 && s.charAt(i)=='1' && s.charAt(i+1) == '0' && s.charAt(i+2)=='1') {ans++;i+=2;}
                
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
// Unsolved 