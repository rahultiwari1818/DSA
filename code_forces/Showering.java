import java.util.*;

public class Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();  // number of blocked intervals
            int s = sc.nextInt();  // required consecutive free time
            int m = sc.nextInt();  // total timeline length
            
            List<int[]> intervals = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                intervals.add(new int[]{l, r});
            }
            
            // Sort intervals based on start time (and end time if necessary)
            intervals.sort(Comparator.comparingInt(a -> a[0]));
            
            boolean flag = false;
            int freeTime = 0;
            int lastEnd = 0;  // Tracks where the last blocked interval ends
            
            for (int[] interval : intervals) {
                int l = interval[0];
                int r = interval[1];
                
                // Count the free time between lastEnd and the start of the current blocked interval
                if (l > lastEnd) {
                    freeTime += (l - lastEnd);
                    if (freeTime >= s) {
                        flag = true;
                        break;
                    }
                    freeTime = 0;  // Reset freeTime if interrupted by a blocked period
                }
                
                // Update the lastEnd to the maximum of itself and the end of the current interval
                lastEnd = Math.max(lastEnd, r);
            }
            
            // After the last blocked interval, check the remaining time
            if (m > lastEnd) {
                freeTime += (m - lastEnd);  // Remaining free time after the last block
                if (freeTime >= s) {
                    flag = true;
                }
            }
            
            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }
}
