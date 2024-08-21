import java.util.*;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int specialTicketPrice = (n/m)*b;
        int normalPrice = n*a;
        if (m >= n){
            System.out.println(Math.min(b,normalPrice));
        }
        else{
            if(n%m == 0){
                System.out.println(Math.min(specialTicketPrice,normalPrice));
            }
            else{
                System.out.println(Math.min(normalPrice,Math.min(specialTicketPrice+b,specialTicketPrice+((n%m)*a))));
            }
        }
    }
}
