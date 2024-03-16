//Contiguous Array

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                len = i + 1;
            } else if (mp.containsKey(sum)) {
                len = Math.max(len, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return len;
    }
}