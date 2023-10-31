//Generate Parentheses

class Solution {
    static List<String> ans;
    static void create(int open, int close, String s){
        if(open == 0 && close == 0)
            ans.add(s);
        if(open > 0)
            create(open-1, close+1, s+"(");
        if(close > 0)
            create(open, close-1, s+")");
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        create(n, 0, "");
        return ans;
    }
}