//Number of Segments in a String

import java.util.*;

class Solution {
    public int countSegments(String s) {
        StringTokenizer s1 = new StringTokenizer(s, "\s");
        int c=0;
        while(s1.hasMoreTokens()){
            c++;
            s1.nextToken();
        }
        return c;
    }
}