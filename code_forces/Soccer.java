import java.util.*;

public class Soccer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if(x1<x2 && y1<=y2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }   
    }
}