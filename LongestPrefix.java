//Longest Prefix in a String
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;
        char[] first = strs[0].toCharArray();
        char[] last = strs[n-1].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i] != last[i])
                break;
            else{
                char ch = first[i];
                sb.append(ch);
            }
        }
        return sb.toString();
        }   
    }
