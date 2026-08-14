import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        //Map solution: time O(n) - space O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
            System.out.println(map);
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
        
        int [] nums = {-1, -2, 0, 4, 5};
        int target = 3;
        int[] result = twoSum(nums, target);
        System.out.println("Test case 1: Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
