//kth smallest element in sorted array

class Solution {
    public int kthSmallest(int[][] matrix, int key) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ar = new int[row*col];
        int k=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ar[k]=matrix[i][j];
                k++;
            }
        }

        Arrays.sort(ar);
        return ar[key-1];
    }
}