//Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1])
                    max=i+1;
        }
        return max;
    }
}