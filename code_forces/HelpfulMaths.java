import java.util.*;

public class HelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='1' && arr[i]<='9'){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>='1' && arr[j]<='9' && arr[i]>arr[j]){
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(arr);
    }
}