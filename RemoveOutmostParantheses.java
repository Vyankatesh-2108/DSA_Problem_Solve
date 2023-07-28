//Remove Outermost Parantheses

class Solution {
    public String removeOuterParentheses(String s) {
       String out="";
       int c=0;
       int n = s.length();
       for(int i=0; i<n; i++){
           if(s.charAt(i) == '('){
               c++;
               if(c>=2)
                out += "(";
           }
           else{
               c--;
               if(c>=1)
                    out+=")";
           }
       }
       return out;
    }
}