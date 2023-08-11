//Reverse Words In A String
class Solution {
    public String reverseWords(String s) {
    int n = s.length();
    int i=0, j=0;
    String result = "";
    while(i<n){
        while(i<n && s.charAt(i) == ' ')
            i++;
        
        if(i>=n)
            break;

        j=i+1;
        while(j<n && s.charAt(j) != ' ')
            j++;

        String sub = s.substring(i,j);

        if(result.isEmpty())
            result = sub;
        else
            result = sub + " " + result;

        i=j+1;
    }
    return result;
    }
}