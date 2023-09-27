//separate the digits in an array

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ArrayList<Integer> arr2 = new ArrayList<>();
            int n = nums[i];
            while(n!=0){
                arr2.add(n%10);
                n=n/10;
            }
            for(int k=arr2.size()-1; k>=0; k--)
                arr1.add(arr2.get(k));
        }
        int j=0;
        int[] a = new int[arr1.size()];
        for(int i : arr1){
            a[j]=i;
            j++;
        }
        return a;
    }
}