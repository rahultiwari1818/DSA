import java.util.*;

public class Lucky {

    public static int parse(char c){
        return Character.getNumericValue(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            int sum1 = 0,sum2 = 0;
            sum1+= parse(s.charAt(0)) + parse(s.charAt(1)) + parse(s.charAt(2)); 
            sum2+= parse(s.charAt(3)) + parse(s.charAt(4)) + parse(s.charAt(5)); 
            if(sum1 == sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
