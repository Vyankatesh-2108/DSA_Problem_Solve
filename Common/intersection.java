class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
            int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] > nums2[j])
                j++;
            else if(nums1[i] < nums2[j])
                i++;
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] out = new int[arr.size()];
        for(int k=0; k<arr.size(); k++){
            out[k]=arr.get(k);
        }
        return out;
    }
}