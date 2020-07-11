public class Solution724 {
    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                right += nums[j];
            }
            if (left == right)
                return i;
        }
        return -1;
    }

    public static int pivotIndex2(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int j = 0; j < nums.length; j++) {
            if (left * 2 == sum - nums[j]) {
                return j;
            }
            left += nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        System.out.println(pivotIndex2(nums));
    }
}
