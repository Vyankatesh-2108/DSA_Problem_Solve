//Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> ar = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(ar.contains(nums[i]))
                return nums[i];
            else
                ar.add(nums[i]);
        }
        return -1;
    }
}