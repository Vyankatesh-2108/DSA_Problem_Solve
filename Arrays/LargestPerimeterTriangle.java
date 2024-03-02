//Largest Perimeter Triangle

class Solution {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=2; i--){
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];
            if(a+b > c)   
                return a+b+c;
        }
        return 0;
    }
}