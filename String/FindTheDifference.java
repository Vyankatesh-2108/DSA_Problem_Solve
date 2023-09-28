//Find The Difference

class Solution {
    public char findTheDifference(String s, String t) {
       int sum = 0;
       for(int ch : t.toCharArray())
            sum += ch;
        for(int ch : s.toCharArray())
            sum -= ch;
        return (char) sum;
    }
}