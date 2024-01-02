//To Lower Case without using predefined function

class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z')
                ch = (char) ((int) ch + 32);
            ans.append(ch);
        }
        return ans.toString();
        //using build in function
        //return s.toLowerCase();
    }
}