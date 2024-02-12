//Major Element

class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> mp = new HashMap<>();
       for(int i=0; i<nums.length; i++){
           if(mp.containsKey(nums[i]))
                mp.put(nums[i], mp.get(nums[i])+1);
            else
                mp.put(nums[i], 1);
       }
       int n = Collections.max(mp.values());
       for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
           if(entry.getValue() == n)
            return entry.getKey();
       }
       return -1;
    }
}