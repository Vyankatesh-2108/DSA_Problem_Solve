//Reverse Only Letters

class Solution {
    public String reverseOnlyLetters(String s) {
    char[] arr = s.toCharArray();
    int i=0, j=s.length()-1;
    while(i < j){
        if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        else if(!Character.isLetter(arr[i]))
            i++;
        else if(!Character.isLetter(arr[j]))
            j--;
    }
    return String.valueOf(arr);
    }
}