//Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp = 0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}