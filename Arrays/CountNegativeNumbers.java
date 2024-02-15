//Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       int count=0;
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               if(grid[i][j] < 0)
                count++;
           }
       } 
       return count;
    }
}