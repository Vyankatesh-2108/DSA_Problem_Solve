//Remove Outermost Parentheses

class Solution {
    public String removeOuterParentheses(String s) {
    int c=0;
    String ans = "";
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='('){
            c++;
            if(c>=2)
                ans += '(';
        }else{
            c--;
            if(c>=1)
                ans += ')';
        }        
    }
    return ans;
    }
}