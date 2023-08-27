//Add String

import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
    BigInteger n1 = new BigInteger(num1);
    BigInteger n2 = new BigInteger(num2);
    n1 = n1.add(n2);
    return String.valueOf(n1); 
    }
}