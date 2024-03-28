//Length of Longest Subarray With at Most K Frequency


class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0, ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (left < nums.length && right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}