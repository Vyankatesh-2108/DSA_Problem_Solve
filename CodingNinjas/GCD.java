//Greatest Common divisor

import java.util.*;
public class Solution {
	static int gcd(int a, int b){
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a<b)
			return gcd(a, b-a);
		if(a>b)
			return gcd(a-b, b);
		return -1;
	}	
	public static void main(String[] args)  
	{
	    // Write your code 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++){
			int p=sc.nextInt();
			int q=sc.nextInt();
			System.out.println(gcd(p,q));
		}
	}
}

