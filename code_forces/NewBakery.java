import java.util.*;

public class NewBakery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long maxK = Math.min(n, b); // max number of buns that can be sold at modified prices
            
            // Case 1: All buns sold at usual price 'a'
            long profitAllAtA = n * a;
            
            long sumModifiedPrices = maxK * b - maxK * (maxK - 1) / 2; // Sum of modified prices
            long profitWithMaxK = sumModifiedPrices + (n - maxK) * a;
            
            long maxProfit = Math.max(profitAllAtA, profitWithMaxK);
            
            System.out.println(maxProfit);
        }
        sc.close();
    }
}

// unsolved