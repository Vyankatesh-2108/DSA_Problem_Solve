//Maximize Happiness of Selected Children

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=happiness.length-1;
        long c=0, ans=0;
        while(k > 0){
            if(happiness[i]-c < 0)
                return ans;
            ans += (long)happiness[i]-c;
            i--;
            c++;
            k--;
        }
        return ans;
    }
}