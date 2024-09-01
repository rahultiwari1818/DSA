import java.util.*;
public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a<=b  && b<=c) ||(c<=b  && b<=a) ){
                System.out.println(b);
            }
            else if((b<=a && a<=c) || (c<=a  && a<=b)){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
}
