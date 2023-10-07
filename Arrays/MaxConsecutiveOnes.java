//Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, m=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                count++;
            else
                count=0;
            if(m<count)
                m=count;
        }
        return m;
    }
}