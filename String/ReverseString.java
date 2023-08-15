//Reverse a String
public class Main
{
	public static void main(String[] args) {
		String str = "anurag";
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--){
		    sb.append(str.charAt(i));
		}
		System.out.print(sb.toString());
	}
}