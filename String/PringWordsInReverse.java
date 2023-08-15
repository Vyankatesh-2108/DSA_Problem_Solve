//#1 Logic. How to reverse the words in a given String sentence?
//o/p: best is Java
public class Main
{
	public static void main(String[] args) {
	    String str = "Java is best";
	    String[] s = str.split("\\s");
	    String ans = "";
	    for(String word : s){
	        StringBuilder sb = new StringBuilder();
	        ans = sb.append(word)+" "+ans;
	    }
	    System.out.print(ans);
	}
}

/*
// #2 Logic. How to reverse the words in a given String sentence?

public class Main
{
	public static void main(String[] args) {
        String str = "I am vyankatesh khetri";
	    String[] s = str.split("\\s");
	    int i=0, j=s.length-1;
	    while(j >= i){
	        String temp = s[i];
	        s[i] = s[j];
	        s[j] = temp;
	        i++;
	        j--;
	    }
	    for(String word : s){
	        System.out.print(word+" ");
	    }
	}
}

*/