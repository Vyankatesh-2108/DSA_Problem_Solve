//Alternating Digit Sum

class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        while(n!=0){
            arr1.add(n%10);
            n=n/10;
        }
        for(int i=arr1.size()-1; i>=0; i--)
            arr2.add(arr1.get(i));
        int sum=0;
        for(int i=0; i<arr2.size(); i++){
            if(i%2==0){
                sum += arr2.get(i);
            }else{
                sum -= arr2.get(i);
            }
        }    
        return sum;  
    }
}