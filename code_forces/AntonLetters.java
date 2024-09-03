import java.util.*;

public class AntonLetters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='{' &&s.charAt(i)!='}' && s.charAt(i)!=',' && s.charAt(i) != ' ' ){
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
        sc.close();
    }
}