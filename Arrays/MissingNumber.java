//Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0; i<n; i++){
            result ^=(i+1)^nums[i];
        }
        return result;
    }
}