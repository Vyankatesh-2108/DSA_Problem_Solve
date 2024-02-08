//Reverse Integer

class Solution {
public:
    int reverse(int x) {
        int rev=0;
        while(x != 0){
            int rem = x%10;
            x=x/10;
            if(rev > 0 && rev > (INT_MAX-rem)/10 || rev < 0 && rev < (INT_MIN-rem)/10)
                return 0;
            rev = rev*10+rem;
        }
        return rev;
    }
};