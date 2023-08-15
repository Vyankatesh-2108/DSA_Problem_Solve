//Find Maximum Occurring Character In String :

import java.util.*;
import java.util.Map.Entry;
public class Main
{
	public static void main(String[] args) {
	    String str = "heLLo";
	    char[] ch = str.toCharArray();
		HashMap<Character, Integer> s = new HashMap<>();
        for(char c : ch){
            if(s.containsKey(c))
               s.put(c, s.get(c)+1);
            else
              s.put(c, 1);
        }
       
        Set<Entry<Character, Integer>> entrySet = s.entrySet();
        int maxCount = 0;
        char maxChar = 0;
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        
        System.out.println(maxChar);
	}
}