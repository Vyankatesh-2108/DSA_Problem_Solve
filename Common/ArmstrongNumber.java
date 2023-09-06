import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 371;
	    int count=0;
	    int temp  = n;
	    while(temp != 0){
	        temp = temp/10;
	        count++;
	    }
	    temp=n;
	    int rem=0;
	    int sum=0;
	    while(temp!=0){
	        rem = temp%10;
	        sum += Math.pow(rem,count);
	        temp = temp/10;
	    }
	    if(sum == n)
	        System.out.print("Armstrong Number");
	   else 
	        System.out.print("Not a Armstrong Number");
	}
}
