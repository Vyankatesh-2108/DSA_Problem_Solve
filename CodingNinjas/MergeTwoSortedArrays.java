//Merge Two Sorted Arrays

import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
       List<Integer> arr = new ArrayList<>();
       int n = a.length;
       int m = b.length;
       int i=0, j=0;
       while(i<n){
           if(!arr.contains(a[i]))
            arr.add(a[i]);
            i++;
       }
       while(j<m){
           if(!arr.contains(b[j]))
            arr.add(b[j]);
            j++;
       }
       Collections.sort(arr);
       return arr;
    }
}