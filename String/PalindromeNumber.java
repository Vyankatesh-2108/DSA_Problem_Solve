//Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x==1)
            return true;
        String str = String.valueOf(x);
        int j=str.length()-1, i=0;
        while(j>i){
            if(str.charAt(i) != str.charAt(j))
                return false;
            j--;
            i++;
        }
       return true; 
    }
}