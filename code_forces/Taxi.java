import java.util.*;

public class Taxi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] groupSizes = new int[5];
        
        for (int i = 0; i < n; i++) {
            int groupSize = sc.nextInt();
            groupSizes[groupSize]++;
        }

        int totalTaxis = groupSizes[4];

        totalTaxis += groupSizes[3];
        groupSizes[1] = Math.max(0, groupSizes[1] - groupSizes[3]);

        totalTaxis += groupSizes[2] / 2;
        if (groupSizes[2] % 2 != 0) {
            totalTaxis++;
            groupSizes[1] = Math.max(0, groupSizes[1] - 2);
        }

        totalTaxis += (groupSizes[1] + 3) / 4;

        System.out.println(totalTaxis);
        
    }
}