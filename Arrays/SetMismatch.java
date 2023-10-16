//Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.add(i))
                ans[0]=i;
        }
        int sum=0;
        for(int i:hs)
            sum += i;
        int ori = (n*(n+1))/2;
        ans[1] = ori-sum;
        return ans;
    }
}