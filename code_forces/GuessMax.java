import java.util.*;

public class GuessMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<ArrayList<Integer>> ds =  new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<n;i++){
                ArrayList<Integer> t = new ArrayList<Integer>();
                t.add(arr[i]);
                for(int j=i+1;j<n;j++){
                        // Create a new ArrayList based on the current `t`
                        ArrayList<Integer> temp = new ArrayList<Integer>(t);
                        temp.add(arr[j]);
                        ds.add(temp);
                        System.out.println(ds);
                    }
                }
            
            System.out.println(ds);
            System.out.println(1);
        }
    }
    
}