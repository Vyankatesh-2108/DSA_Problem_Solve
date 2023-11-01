//Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        int index=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[index-2]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}