//Sort Array By Parity II

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int j=0,k=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                arr[j]=nums[i];
                j+=2;
            }else{
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}