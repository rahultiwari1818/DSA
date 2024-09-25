import java.util.Scanner;

public class MatrixProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long vals = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(vals+" ");
                vals++;
            }
            System.out.println();
        }
        sc.close();
    }
}
// Unsolved
