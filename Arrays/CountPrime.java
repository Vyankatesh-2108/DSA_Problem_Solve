//count prime

class Solution {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        for(int i = 2; i < n; i++)
            isPrimes[i] = true;
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if( isPrimes[i] ){
                count++;
                
                if( i <= Math.sqrt(n) ){
                    for(int j = i*i; j < n; j+=i)
                        isPrimes[j] = false;
                }
            }
        }
        
        return count;
    }
}