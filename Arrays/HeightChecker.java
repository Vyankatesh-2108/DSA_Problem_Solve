//Height Checker

class Solution {
    public int heightChecker(int[] nums) {
        int count=0;
        int[] arr = new int[nums.length];
        int j=0;
        for(int i : nums){
            arr[j]=i;
            j++;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=nums[i])
                count++;
        } 
        return count; 
    }
}