import java.util.*;
public class Main
{   
    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Prime Numbers : ");
		for(int i=2; i<=n; i++){
		    if(isPrime(i))
		        System.out.print(i+" ");
		}
	}
}
