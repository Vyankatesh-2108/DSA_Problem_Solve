//Maximum Consecutive ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        int m=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                max=count;
            }else{
                count=0;
            }
            if(max > m){
                m=max;
            }   
        }
        return m;
    }
}