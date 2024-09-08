import java.util.*;
public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            char c = sc.next().charAt(0);
            if("codeforces".contains(Character.toString(c))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
