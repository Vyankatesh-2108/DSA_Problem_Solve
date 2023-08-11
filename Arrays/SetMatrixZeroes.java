//Set Matrix Zeroes


class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

            for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    arr1.add(i);
                    arr2.add(j);
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(arr1.contains(i) || arr2.contains(j))
                    matrix[i][j] = 0;
            }
        }

    }
}