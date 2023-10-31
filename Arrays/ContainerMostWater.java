//Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int max=0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[right], height[left]);
            int area = w*h;
            max = Math.max(area, max);
            if(height[left] < height[right])
                left++;
            else if(height[left] > height[right])
                right--;
            else{   
                left++;
                right--;
            }
        }
        return max;
    }
}