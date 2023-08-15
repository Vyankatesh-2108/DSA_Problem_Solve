//palindrom String

public class Main
{
	public static void main(String[] args) {
		String str = "racecar";
		int n =str.length();
		
// #1 Logic
 		int i=0;
 		int j=n-1;
 		boolean re = false;
 		while(j>i){
 		    if(str.charAt(i) != str.charAt(j))
 		        re=false;
 		    else    
 		        re=true;
 		    i++;
 		    j--;
 		}
 		System.out.println(re);

//2nd Logic

// 		boolean re=false;
// 		for(int i=0; i<n/2; i++){
// 		    if(str.charAt(i) != str.charAt(n-i-1)){
// 		        re = false;
// 		    }else
// 		        re=true;
// 		}
// 		System.out.println(re);
		
	}
}