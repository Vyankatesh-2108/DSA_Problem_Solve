//Maximum odd binary number

class Solution {
    public String maximumOddBinaryNumber(String binaryString) {
        int countOnes = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char ch : binaryString.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }
        
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        
        sb.append('1');
        return sb.toString();
    }
}