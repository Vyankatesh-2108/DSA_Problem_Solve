//First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            arr.add(num);
        }
        for(int i=1; i<=n+1; i++){
            if(!arr.contains(i))
                return i;
        }
        return 1;
    }
}