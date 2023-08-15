//Remove Duplicates from string

public class Main
{
	public static void main(String[] args) {
	String str = "anurag";
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<str.length(); i++){
	    int flag=0;
	    for(int j=i+1; j<str.length(); j++){
	        if(str.charAt(i)==str.charAt(j)){
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0){
	        sb.append(str.charAt(i));
	    }
	}
	System.out.println(sb.toString());
	}
}