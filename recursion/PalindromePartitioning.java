public class PalindromePartitioning {

    public static boolean isPalindome(String s,int start,int end){
        while( start <= end){
            if(s.charAt(start++) != s.charAt((end--))) return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        System.out.println(isPalindome("wow", 0, 2));
    }
}
