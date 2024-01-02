//First Letter to Appear Twice

class Solution {
    public char repeatedCharacter(String s) {  
        List<Character> ar = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(ar.contains(s.charAt(i)))
                return s.charAt(i);
            ar.add(s.charAt(i));
        }
        return '0';
    }
}