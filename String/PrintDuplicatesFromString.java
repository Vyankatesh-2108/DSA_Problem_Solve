//print Duplicates from string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str = "GeeksforGeeks";
	char[] ch = str.toCharArray();
	Map<Character, Integer> mp = new HashMap<>();
	for(char chara : ch){
	    if(mp.containsKey(chara))
	        mp.put(chara, mp.get(chara)+1);
	    else   
	        mp.put(chara, 1);
	}
	for(Map.Entry<Character, Integer> entry : mp.entrySet()){
	    if(entry.getValue() > 1)
	        System.out.println(entry.getKey() + " : "+entry.getValue());
	}
	
	}
}
