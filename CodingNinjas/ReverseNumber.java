//Reverse Number

import java.util.* ;
import java.io.*; 

public class Solution {
	public static long reverseNumber(long n) {
		String s = String.valueOf(n);
		int c=0;
		String ans = "";
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)==0)
				c=1;
			if(c<1){
				ans += s.charAt(i);
			}
		}
		long m = Long.parseLong(ans);
		return m;
	}
}