//Single Number

class Solution {
    public int singleNumber(int[] nums) {
    int ans=nums[0];
        int n=nums.length;
        for(int i=1; i<n; i++){
            ans=ans ^ nums[i];
        }
        return ans;
    }
}