//Find First Palindromic String in the Array

class Solution {
    public String firstPalindrome(String[] s1) {
        for(String w : s1){
           int i=0,flag=1;
           int j=w.length()-1;
           while(i<j){
               if(w.charAt(i) != w.charAt(j))
                    flag=0;
                i++;
                j--;
           }
           if(flag==1)
            return w;
        }
        return "";
    }
}