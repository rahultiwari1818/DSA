import java.util.*;

public class ChatRoom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String word = "hello";
        int ptr = 0;
        int ptr2 = 0;
        while(ptr < s.length() && ptr2 < word.length()){
            if(s.charAt(ptr) == word.charAt(ptr2)){
                ptr++;
                ptr2++;
            }
            else{
                ptr++;
            }
        }
        if(ptr2 < word.length()){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}

/*
 * 
 * hello
 * hlelo
 */