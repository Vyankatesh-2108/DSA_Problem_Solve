//Isomorphic String
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m1 = t.length();
        if(n!=m1)
            return false;
        Map<Character, Character> m = new HashMap<>();
        for(int i=0; i<n; i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!m.containsKey(original)){
                if(!m.containsValue(replacement)){
                    m.put(original, replacement);
                }
                else{
                    return false;
                }
            }else{
                char mul = m.get(original);
                if(mul != replacement)
                    return false;
            }
        }
       return true;
    }
}