//Rotate Array to right by k times

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length, j;
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
        j=(i+k)%n;
        ans[j]=nums[i];
    }
    for(int i=0; i<n; i++)
        nums[i]=ans[i];
    } 
}