//Add to Array

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ls = new LinkedList<>();
        int n = num.length-1;
        while(n >= 0 || k!=0){
            if(n>=0){
                k = k+num[n];
                n--;
            }
            ls.addFirst(k%10);
            k = k/10;
        }
        return ls;
    }
}