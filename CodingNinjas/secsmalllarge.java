//Second Largest and Second Smallest

import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int[] arr = new int[2];
        arr[1] = a[1];
        arr[0] = a[a.length-2];
        return arr;
    }
}