import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        if (nums == null || nums.length < 2) {
            return new int[0];
        } else if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                return new int[]{0, 1};
            } else {
                return new int[0];
            }
        }

        //Map solution: time O(n) - space O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        /* time O(n^2) - space O(1) solution 
        if (nums==null || nums.length==0) {
            return new int[0];
        } else {
            for (int i=0; i<nums.length; i++) {
                for (int j = i+1; j<nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i,j};
                    }
                }
            }
        } 
        
        */
        return new int[0];
    }

    public static void main(String[] args) {
        
        int [] nums = {1, 2, 3};
        int target = 8;
        int[] result = twoSum(nums, target);
        if (result.length == 0 || (result.length == 1 && result[0] == 0)) {
            System.out.println("No two indices found in " + java.util.Arrays.toString(result) + " whose values add up to " + target);
        } else {
            System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
        }
    }
}
