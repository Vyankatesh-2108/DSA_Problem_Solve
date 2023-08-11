//Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstart = 0;
        int colstart = 0;
        int rowend = matrix.length-1;
        int colend = matrix[0].length-1;
        List<Integer> res = new ArrayList<>();
        while(rowstart <= rowend && colstart <= colend){

            for(int j=colstart; j<=colend; j++)
                res.add(matrix[rowstart][j]);
            rowstart++;

            for(int j=rowstart; j<=rowend; j++)
                res.add(matrix[j][colend]);
            colend--;
        
            if(rowstart <= rowend){
                for(int j=colend; j>=colstart; j--)
                    res.add(matrix[rowend][j]);
            }
            rowend--;

            if(colstart <= colend){
                for(int j=rowend; j>=rowstart; j--)
                    res.add(matrix[j][colstart]);
            }
            colstart++;
        }
        return res;

    }
}