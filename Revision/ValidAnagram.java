//Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] cnt = new int[26];

        for(char ch : s.toCharArray())
            cnt[ch-97]++;
        for(char ch : t.toCharArray())
            cnt[ch-97]--;
        
        for(int i : cnt){
            if(i != 0)
                return false;
        }
        return true;
    }
}