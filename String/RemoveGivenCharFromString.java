//How do you remove a given character from String?

public class Main
{
	public static void main(String[] args) {
	    String str="programming";
	    StringBuilder sb = new StringBuilder();
	    char chara = 'a';
	    char[] ch = str.toCharArray();
	    for(int i=0; i<ch.length; i++){
	        if(ch[i] != chara){
	            sb.append(ch[i]);
	        }
	    }
	    System.out.println(sb.toString());
	}
}