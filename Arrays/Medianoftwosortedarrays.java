//Median of two sorted arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int[] arr = new int[n+m];
       int j=0;
       for(int i=0; i<n; i++){
           arr[j]=nums1[i];
           j++;
       }
       for(int i=0; i<m; i++){
           arr[j]=nums2[i];
           j++;
       }
       Arrays.sort(arr);
       int k = arr.length/2;
       double ans = 0;
       if(arr.length % 2 == 0)
            ans = (double)(arr[k]+arr[k-1])/2;
        else
            ans = (double)(arr[k]);
       return ans;
    }
}