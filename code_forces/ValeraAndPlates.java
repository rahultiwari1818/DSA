import java.util.*;

public class ValeraAndPlates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int dishes[] = new int[n];
        for(int i=0;i<n;i++){
            dishes[i] = sc.nextInt();
        }
        int count=0;
        for(int dish:dishes){
            if(dish == 1){
                if(m==0){
                    count++;
                }
                else{
                    m--;
                }
            }
            else{
                if(k > 0){
                    k--;
                }
                else if(m > 0){
                    m--;
                }
                else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}