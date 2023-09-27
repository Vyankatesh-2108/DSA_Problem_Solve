//Happy Number

class Solution {
    public boolean isHappy(int n) {
    int sum, rem;
    Set<Integer> s1=new HashSet<>();    
    while(s1.add(n)){ 
       sum=0;  
       while(n!=0){
            rem = n%10;
           sum = sum+(rem*rem);
           n = n/10;
       } 
        if(sum==1)
            return true;
        else
            n = sum;
    }
    
    return false;
    }
}