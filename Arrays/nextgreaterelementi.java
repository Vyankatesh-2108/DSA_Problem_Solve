//next greater element i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int max=-1;
            for(int j=0; j<nums2.length; j++){
                int index=j;
                if(nums1[i] == nums2[j]){
                    while(index < nums2.length){
                        if(nums2[index] > nums1[i]){
                            max=nums2[index];
                            break;
                        }
                        index++;
                    }
                }
            }
            arr[i]=max;
        }
        return arr;
    }
}