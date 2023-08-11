//Move Zeros

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
               int temp=nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
                j++;
            }
        }
    }
}