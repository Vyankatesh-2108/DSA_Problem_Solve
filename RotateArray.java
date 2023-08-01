//Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length, j;
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
         j = (i+k)%n;
         arr[j]=nums[i];
      }
      for(int i=0; i<n; i++)
         nums[i]=arr[i];
    } 
    }