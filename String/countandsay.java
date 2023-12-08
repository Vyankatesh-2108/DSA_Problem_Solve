//count and say

class Solution {
    public String countAndSay(int n) {
        String val = "1";
        for(int i=0; i<n-1; i++) {
            char ch = val.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j<val.length(); j++) {
                if(ch != val.charAt(j)) {
                    sb.append(count);
                    sb.append(ch);
                    count = 0;
                    ch = val.charAt(j);
                }
                count++;
            }

            sb.append(count);
            sb.append(ch);
            val = sb.toString();
        }
        return val;
    }
}