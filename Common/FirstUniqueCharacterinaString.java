//First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int[] ch = new int[26];
        for(int i=0; i<s.length(); i++)
            ch[s.charAt(i)-'a']++;
        for(int i=0; i<s.length(); i++)
            if(ch[s.charAt(i)-'a'] == 1)
                return i;
        return -1;
    }
}