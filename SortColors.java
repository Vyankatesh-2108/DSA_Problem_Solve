//Sort Colors by 0's, 1's and 2's
class Solution {
    public void sortColors(int[] nums) {
	//We can Also use 
	//Arrays.sort(nums);
        int zeros=0, ones=0, twos=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0)
                zeros++;
            else if(nums[i] == 1)
                ones++;
            else
                twos++;
        }
        int j=0;
        while(zeros > 0){
            nums[j] = 0;
            zeros--;
            j++;
        }
        while(ones > 0){
            nums[j] = 1;
            ones--;
            j++;
        }
        while(twos > 0){
            nums[j] = 2;
            twos--;
            j++;
        }
    }
}