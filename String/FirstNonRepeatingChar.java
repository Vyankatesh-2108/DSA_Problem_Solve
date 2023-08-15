//How to find the first non-repeating character in a given String
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str = "anurag";
	    char[] ch = str.toCharArray();
	    Map<Character, Integer> mp = new LinkedHashMap<>();
	    for(char chara : ch){
	        if(mp.containsKey(chara))
	            mp.put(chara, mp.get(chara)+1);
	        else    
	            mp.put(chara, 1);
	    }
	    for(Map.Entry<Character, Integer> entry : mp.entrySet()){
	        if(entry.getValue() == 1){
	            System.out.println(entry.getKey());
	            break;
	        }
	    }
	    
	}
}