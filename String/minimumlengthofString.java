//minimum length of String

class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            char ch = s.charAt(i);
            while(i<=j && s.charAt(i) == ch){
                i++;
            }
            while(i<=j && s.charAt(j) == ch){
                j--;
            }
        }
        return Math.max(0, j-i+1);
    }
}