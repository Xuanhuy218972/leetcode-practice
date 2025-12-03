class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int need_number = target - num;
            if (map.containsKey(need_number)) 
                return new int[] { map.get(need_number), i };
            else 
                map.put(nums[i], i);
        }
        return new int[] {};
    }
}
