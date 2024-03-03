//Distribute Elements Into Two Arrays I

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ar1 = new ArrayList<>();
        List<Integer> ar2 = new ArrayList<>();
        ar1.add(nums[0]);
        ar2.add(nums[1]);
        int n1 = nums.length;
        int i=2;
        while(i<n1){
            if(ar2.get(ar2.size()-1) < ar1.get(ar1.size()-1))
                ar1.add(nums[i]);
            else
                ar2.add(nums[i]);
            i++;
        }
        int n = ar1.size();
        int m = ar2.size();
        int[] arr = new int[n+m];
        int k=0;
        for(int i1:ar1){
            arr[k]=i1;
            k++;
        }
        for(int i2:ar2){
            arr[k]=i2;
            k++;
        }
        return arr;
    }
}