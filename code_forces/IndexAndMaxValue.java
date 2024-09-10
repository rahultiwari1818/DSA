import java.util.*;

// Unsolved 

public class IndexAndMaxValue {

    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];

            // Reading the initial array and find the initial maximum
            int currentMax = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                currentMax = Math.max(currentMax, arr[i]);
            }

            // Performing operations
            for (int i = 0; i < m; i++) {
                char operation = sc.next().charAt(0);
                int l = sc.nextInt();
                int r = sc.nextInt();
                boolean recalculateMax = false;

                // Apply operations within range
                for (int j = 0; j < n; j++) {
                    if (arr[j] >= l && arr[j] <= r) {
                        if (operation == '+') {
                            arr[j]++;
                        } else {
                            arr[j]--;
                        }

                        // If currentMax is affected, set flag to recalculate
                        if (arr[j] > currentMax) {
                            currentMax = arr[j];
                        } else if (arr[j] < currentMax) {
                            recalculateMax = true;
                        }
                    }
                }

                // Recalculate maximum if necessary
                if (recalculateMax) {
                    currentMax = findMax(arr);
                }

                // Print the current maximum
                System.out.print(currentMax + (i != m - 1 ? " " : ""));
            }

            System.out.println();
        }

        sc.close();
    }
}
