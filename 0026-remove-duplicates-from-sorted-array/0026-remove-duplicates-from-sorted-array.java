class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex=0;
        for(int currentElement:nums){
            //check for first element or if it's different from previous unique element
            if(uniqueIndex==0||currentElement!=nums[uniqueIndex-1]){
                nums[uniqueIndex]=currentElement;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}