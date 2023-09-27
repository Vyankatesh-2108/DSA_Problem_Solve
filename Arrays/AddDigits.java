//Add Digits

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if(num==0)
            return num;
        if(num<10)
            return num;
        while(num!=0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return addDigits(sum);
    }
}