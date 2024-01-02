//Longer Contiguous Segments of Ones than Zeros

class Solution {
    public boolean checkZeroOnes(String s) {
    int c1=0, c2=0, m1=0, m2=0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '1')
            c1++;
        else
            c1=0;
        if(c1>m1)
            m1=c1;
    }   
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '0')
            c2++;
        else
            c2=0;
        if(c2>m2)
            m2=c2;
    }
        return m1>m2;
    }
}