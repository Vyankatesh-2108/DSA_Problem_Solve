//How to remove characters from the first String which are present in the second String?

public class Main
{
	public static void main(String[] args) {
		String a = "India is great";
		a=a.toLowerCase();
		String b = "in";
		b=b.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a.length(); i++){
		    int flag=0;
		    for(int j=0; j<b.length(); j++){
		        if(a.charAt(i) == b.charAt(j)){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        sb.append(a.charAt(i));
		    }
		}
		System.out.println(sb.toString());
	}
}