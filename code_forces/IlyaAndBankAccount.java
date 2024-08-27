import java.util.*;
public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n < 0 ){
                int r1 = n%10;
                // if(r1 == 0){
                //     System.out.println(n);
                // }
                // else{
                    n/=10;
                    int r2 = n%10;
                    n/=10;
                    int mx = Math.max(r1,r2);
                    if(n==0 && mx ==0){
                        System.out.println(0);
                    }
                    else if(n==0){
                        System.out.println(mx);
                    }
                    // else if(mx==0){
                    //     System.out.println(n+""+Math.abs(mx));
                    // }
                    else {
                        System.out.println(n+""+Math.abs(mx));
                    }
                // }
        }
        else{
                System.out.println(n);
            

        }
    }
}
