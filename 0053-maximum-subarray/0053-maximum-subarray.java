class Solution {
    public int maxSubArray(int[] nums) {
        //initialize with first element
        int maxSum=nums[0];
        //track the max sum ending at the current position
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(currentSum,0)+nums[i];
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}