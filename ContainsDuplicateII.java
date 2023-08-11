//Contains Duplicate II

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Map<Integer, Integer> mp = new HashMap<>();
      for(int i=0; i<nums.length; i++){
          if(mp.containsKey(nums[i])){
             int a = mp.get(nums[i]);
             if(Math.abs(a-i) <= k)
                return true; 
             else
                mp.put(nums[i], i);
          }else{
              mp.put(nums[i], i);
          }
      }
      return false;
    }
}