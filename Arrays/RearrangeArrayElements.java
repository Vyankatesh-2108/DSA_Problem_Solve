//Rearrange Array Elements by Sign

class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int j=0;
    for(int i=0; i<n; i++){
        if(nums[i] > 0){
            res[j]=nums[i];
            j += 2;
        }
    }
    j=1;
    for(int i=0; i<n; i++){
        if(nums[i]<0){
            res[j]=nums[i];
            j += 2;
        }
    }
    return res;
    }
}