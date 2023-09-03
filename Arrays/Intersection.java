class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> ar = new HashSet<>();
    for(int i=0; i<nums1.length; i++){
        for(int j=0; j<nums2.length; j++){
            if(nums1[i]==nums2[j])
                ar.add(nums1[i]);
        }        
    }
    int[] arr = new int[ar.size()];
    int i=0;
    for(int c : ar){
        arr[i]=c;
        i++;
    }
    return arr;        
    }
}