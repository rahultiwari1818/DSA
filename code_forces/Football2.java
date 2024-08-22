import java.util.*;

public class Football2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "";
        String s2 = "";
        int m1=0,m2=0;
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(s1.equals("")){
                s1 = s;
                m1++;
            } 
            else if(s.equals(s1)){
                m1++;
            } 
            else if(s2.equals("")){
                s2 = s;
                m2++;
            } 
            else if(s.equals(s2)){
                m2++;
            }
        }
        if(m1 > m2){
            System.out.println(s1);
        }
        else{
            System.out.println(s2);
        }
    }
}
