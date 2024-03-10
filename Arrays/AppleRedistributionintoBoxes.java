//Apple Redistribution into Boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0; i<apple.length; i++){
            sum += apple[i];
        }
        int count=0;
        Arrays.sort(capacity);
        int max=0;
        for(int j=capacity.length-1; j>=0; j--){
            max+=capacity[j];
            count++;
            if(max >= sum)
                break;  
        }
        return count;
    }
}