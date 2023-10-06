//Largest Element in the array

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i])
                max = arr[i];
        }
    return max;
    }
}