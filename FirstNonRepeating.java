//first non repeating

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {9, 4, 9, 6, 7, 4};
	    LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
            for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
             if(entry.getValue() == 1){
                 System.out.print(entry.getKey());
                 break;
             }
        }

	}
}
