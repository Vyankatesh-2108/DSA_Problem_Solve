//Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++)
            ans ^= (i+1)^nums[i];
        return ans;
    }
}