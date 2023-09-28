//Find All Duplicates in Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> ar1 = new HashSet<>();
        List<Integer> ar2 = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(ar1.contains(nums[i]))
                ar2.add(nums[i]);
            else
                ar1.add(nums[i]);
        }
        return ar2;
    }
}