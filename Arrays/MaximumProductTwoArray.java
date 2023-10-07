//Maximum Product of Two Elements in an Array

class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0; i<nums.length; i++)
            nums[i]=nums[i]-1;
        int prod=0, max=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                prod = nums[i]*nums[j];
                if(max < prod)
                    max=prod;
            }
        }
        return max;
    }
}