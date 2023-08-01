//Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1 );
            }else{
                hm.put(nums[i], 1);
            }
        }

        int max = Collections.max(hm.values());

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == max)
                return entry.getKey();
        }
    return 0;
    }
}