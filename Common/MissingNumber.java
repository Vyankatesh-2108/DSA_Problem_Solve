//Missing Number

class Solution {
    public int missingNumber(int[] nums) {
    List<Integer> ls = new ArrayList<>();
    for(int i=0; i<nums.length; i++)
        ls.add(nums[i]);
    for(int i=0; i<=nums.length; i++){
        if(!ls.contains(i))
            return i;
    }  
    return -1;
    }
}  