//Frequency Count
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[] arr = {1,1,3,3,4,4,4,5,5};
    int n = arr.length;
    Map<Integer, Integer> hm = new HashMap<>();
    for(int i=0; i<n; i++){
        if(hm.containsKey(arr[i]))
            hm.put(arr[i], hm.get(arr[i])+1);
        else
            hm.put(arr[i],1);
    }
    
    for(Map.Entry<Integer, Integer> en : hm.entrySet()){
        System.out.println(en.getKey() + " : "+ en.getValue());
    }
}
}
