//Faulty Keyboard

class Solution {
    public String finalString(String s) {
      StringBuffer sb = new StringBuffer();
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i)=='i')
            sb.reverse();
          else
            sb.append(s.charAt(i));
      }
      return sb.toString();  
    }
}