//Power of Two

public class Solution {
    public static boolean isPowerOfTwo(int n) {
        // Write your code here.
        if((n & n-1) == 0)
            return true;
        return false;
    }
}