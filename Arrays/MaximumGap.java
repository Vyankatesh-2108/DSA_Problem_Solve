//Maximum Gap

class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2)
            return 0;
        Arrays.sort(nums);
        int diff=0;
        int max=0;
        for(int i=nums.length-1; i>0; i--){
            diff = nums[i]-nums[i-1];
            if(diff > max)
                max=diff;
        }
        return max;
    }
}