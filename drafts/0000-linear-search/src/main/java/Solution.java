public class Solution {
    public static int search(int[] nums, int target) {
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Linear Search Example:");
        int[] nums = {1,2,5,7,9};
        int target = 5;
        int result = search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
