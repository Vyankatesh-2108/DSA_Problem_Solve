//length of last word

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        while(s.charAt(n) == ' ')
            n--;
        int c=0;
        for(int i=n; i>=0; i--){
            if(s.charAt(i) == ' ')
                break;
            c++;
        }
        return c;
    }
}