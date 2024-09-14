import java.util.*;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int currentElement = l;
            int difference = 1;
            int length = 1; 
            while (currentElement + difference <= r) {
                currentElement += difference;
                difference++; 
                length++; 
            }
    
            System.out.println(length);
        }
        sc.close();
    }
}
