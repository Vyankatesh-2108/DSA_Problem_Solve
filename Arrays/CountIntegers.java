//Count Integers With Even Digit Sum

class Solution {
    public static boolean sum(int n){
        int sum1 = 0;
        while(n>0){
            sum1 = sum1 + (n%10);
            n=n/10;
        }
        return (sum1 & 1) == 0 ? true : false;
    }
    public int countEven(int num) {
        int c=0;
        for(int i=1; i<=num; i++){
            if(sum(i))
                c++;
        }
        return c;
    }
}