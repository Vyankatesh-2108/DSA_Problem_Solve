//Add Binary

class Solution {
    public String addBinary(String a, String b) {
        int n = a.length()-1;
        int m = b.length()-1;
        int sum=0, base=2, t1, t2, c=0;
        StringBuilder sb = new StringBuilder();
        while(n>=0 || m>=0){
            t1=0; t2=0;
            if(n>=0){
                t1 = a.charAt(n)-'0';
                n--;
            }
            if(m>=0){
                t2 = b.charAt(m)-'0';
                m--;
            }
            sum = t1+t2+c;
            if(sum >= base){
                c=1;
                sum=sum - base;
            }else
                c=0;
            sb.append(sum);
        }
        if(c == 1)
            sb.append(1);
        
        return sb.reverse().toString();
    }
}