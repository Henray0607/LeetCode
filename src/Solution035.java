public class Solution035 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i])
                return i;
        }
        return 0;
    }

    public static int searchInsert2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert2(nums, target));
    }
}
