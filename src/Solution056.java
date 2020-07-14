import java.util.Arrays;

public class Solution056 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int idx = -1;
        int[][] res = new int[intervals.length][2];
        for (int[] arr : intervals) {
            if (idx == -1 || arr[0] > res[idx][1])
                res[++idx] = arr;
            else
                res[idx][1] = Math.max(res[idx][1], arr[1]);
        }
        return Arrays.copyOf(res, idx + 1);
    }

    public static void main(String[] args) {
        // int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] res = merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.print("[" + res[i][0] + " " + res[i][1] + "] ");
        }
    }
}
