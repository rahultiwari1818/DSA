import java.util.*;
public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            int[] count = new int[7]; // To store count of A-G
            
            for (char ch : a.toCharArray()) {
                count[ch - 'A']++;
            }
            
            int problemsNeeded = 0;
            for (int i = 0; i < 7; i++) {
                if (count[i] < m) {
                    problemsNeeded += (m - count[i]);
                }
            }
            
            System.out.println(problemsNeeded);
        }
        sc.close();
        
    }
}
