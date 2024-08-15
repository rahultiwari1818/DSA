import java.util.*;

public class HQ9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='H' || c=='Q'  || c=='9'){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}