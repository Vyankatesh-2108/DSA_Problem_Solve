//Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];
        
        for(char ch : s.toCharArray())
            count[ch-97]++;
        
        for(char ch : t.toCharArray())
            count[ch-97]--;
        
        for(int val : count)
            if(val != 0)    return false;

    return true;
    }
}