//How do you count the number of words in String?
//i/p: Java is great
//o/p: 3

public class Main
{
	public static void main(String[] args) {
		String str = "How do you count the number of words in String";
		int count=1;
		for(int i=0; i<str.length(); i++){
		   if(str.charAt(i) == ' ')
		        count++;
		}
		System.out.println(count);
		
		//String str = "Java is Great";
		//String[] s = str.split("\\s");
		//print(s.length);
		
	}
}