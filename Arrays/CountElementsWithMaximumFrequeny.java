//Count Elements With Maximum Frequency

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }

        int count=0;
        int maxi = 0;
        for(int i : hm.values()){
            maxi = Math.max(maxi, i);
        }
        for(int i : hm.values()){
            if(i == maxi)
                count+=maxi;
        }
    return count;
    }
}