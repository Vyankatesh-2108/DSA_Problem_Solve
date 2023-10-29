//Valid Parentheses

class Solution {
    public boolean isValid(String s1) {
       Stack<Character> s = new Stack<>();
       for(int i=0; i<s1.length(); i++){
           char ch = s1.charAt(i);
           if(ch == '(' || ch == '{' || ch == '[')
                s.push(ch);
            else{
                if(!s.empty()){
                    char top = s.peek();
                if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '['))
                    s.pop();
                else
                    return false;
                }else
                    return false;
            }
       }
       if(s.empty())
        return true;
        return false;
    }
}