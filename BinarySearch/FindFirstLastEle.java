//Find First and Last Position of Element in Sorted Array

class Solution {
    public static int firstOccurance(int[] nums, int target){
        int l=0;
        int r=nums.length-1;
        int first = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                first = mid;
                r = mid - 1;
            }
            else if(nums[mid] < target)
                l = mid+1;
            else
                r = mid - 1;
        }
        return first;
    }
    public static int lastOccurance(int[] nums, int target){
        int l=0;
        int r=nums.length-1;
        int last = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                last = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target)
                l = mid+1;
            else
                r = mid - 1;
        }
        return last;
    }  
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstOccurance(nums, target);
        arr[1] = lastOccurance(nums, target);
        return arr; 
    }
}