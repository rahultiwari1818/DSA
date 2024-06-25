import java.util.ArrayList;

class Subsequence{

    public static void printArr(ArrayList<Integer> arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printSubsequence(int index,ArrayList<Integer> ans,ArrayList<Integer> newArr,int n){
        if(index == n){
            printArr(newArr);
            return;
        }
        newArr.add(ans.get(index));
        printSubsequence(index+1, ans, newArr, n);
        newArr.remove(ans.get(index));
        printSubsequence(index+1, ans, newArr, n);
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        
        ArrayList<Integer> ans = new ArrayList<>();

        printSubsequence(0, arr, ans, arr.size());
    }

}