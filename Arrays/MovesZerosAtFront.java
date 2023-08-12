//Moves zeros at front of an array

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {12, 0, 7, 0, 8, 0, 3};
	    int j=0;
        for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
        j++;
        }      
     }
     
     for(int i:arr)
        System.out.print(i+" ");
        
    }
}