import java.util.*;

public class Football{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxSum = 0;
        int sum = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)== s.charAt(i)){
                sum+=1;
            }
            else{
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        if(maxSum >= 6){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}