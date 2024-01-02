//Consecutive Characters

class Solution {
    public int maxPower(String s) {
    int c=1, m=1;
    for(int i=0; i<s.length()-1; i++){
        if(s.charAt(i) == s.charAt(i+1)){
            c++;
        }
        else
            c=1;
        if(c>m)
            m=c;
    }
    return m;
    }
}