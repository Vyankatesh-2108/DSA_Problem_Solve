//Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int rightside=0, leftside=0;
        for(int i=0; i<nums.length; i++)
            rightside += nums[i];
        
        for(int i=0; i<nums.length; i++){
            rightside -= nums[i];
            if(rightside == leftside)
                return i;
            leftside += nums[i];
        }
        return -1;
    }
}