import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int ans = 0;
            
            int[][] rounds = {
                {a, c, b, d},
                {a, d, b, c},
                {b, c, a, d},
                {b, d, a, c}
            };
            
            for(int[] round : rounds) {
                int point1 = 0, point2 = 0;
                if(round[0] > round[1]) point1++;
                else if(round[0] < round[1]) point2++;
                if(round[2] > round[3]) point1++;
                else if(round[2] < round[3]) point2++;
                
                if(point1 > point2) ans++;
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}
