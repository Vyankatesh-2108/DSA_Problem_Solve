//Check if Array Is Sorted and Rotated

class Solution {
    public boolean check(int[] nums) {
    int n=nums.length,c=0;
    for(int i=0; i<n; i++){
        if(nums[i] > nums[(i+1)%n])
            c++;
        if(c>1)
            return false;
    }
    return true;
    }
}
