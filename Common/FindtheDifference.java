//Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        int a=0,b=0,c=0;
        for(char ch : s.toCharArray())
            a += ch;
        for(char ch : t.toCharArray())
            b += ch;
        c=b-a;
        return (char) c;
    }
}