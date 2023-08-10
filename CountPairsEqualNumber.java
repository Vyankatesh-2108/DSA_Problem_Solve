//count pairs equal number of zeros and ones

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0, 1, 1};
		int ones=0, twos=0, count=0;
		for(int i=0; i<arr.length; i++){
		    int start = i;
		    for(int j=i; j<arr.length; j++){
		        int end = j;
		        for(int k=start; k<=end; k++){
		          System.out.print(arr[k]+" ");
		          if(arr[k] == 1)
		            ones++;
		          else  
		            twos++;
		        }
		        if(ones == twos)
		            count++;
		      
		           ones=0;
		           twos=0;
		            
		        System.out.println();
		    }
		}
		System.out.println("count = "+count);
	}
}