//valid parantheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] s1 = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char ch = s1[i];
            if(ch == '(' || ch == '[' || ch== '{'){
                st.push(ch);
            }else{
                if(!st.empty()){
                    char top = st.peek();
                    if( (ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[') ){
                        st.pop();
                    }else{
                         return false;
                    }
                }
                else{
                    return false;
                }
            }
        }

        if(st.empty())
            return true;

    return false;   
    }
}