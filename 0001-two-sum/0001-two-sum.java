class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairId = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairId.containsKey(target - num)) {
                return new int[] { i, pairId.get(target - num) };
            }
            pairId.put(num, i);
        }
        return new int[] {};        
    }
}