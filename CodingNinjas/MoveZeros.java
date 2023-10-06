//Move Zeros

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int c=0, j=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                a[j]=a[i];
                j++;
            }
            else    c++;
        }
        while(c!=0){
            a[j]=0;
            j++;
            c--;
        }
        return a;
    }
}