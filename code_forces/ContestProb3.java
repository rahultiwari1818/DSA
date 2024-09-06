import java.util.*;

public class ContestProb3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int xMoves = (int) Math.ceil((double) x / k);
            int yMoves = (int) Math.ceil((double) y / k);
    
            // The minimum total moves required is max of the two
            int totalMoves = Math.max(xMoves * 2 - 1, yMoves * 2);
    
            System.out.println(totalMoves);    
        }
        sc.close();
    }
}
