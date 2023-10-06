//Array is Sorted or Not

public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i] > a[j])
                return 0;
            i++;
            j--;
        }
        return 1;
    }
}