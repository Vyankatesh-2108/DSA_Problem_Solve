//Print Leaders

public class Main
{
	public static void main(String[] args) {
		int[] arr = {8, 23, 19, 21, 15, 6, 11};
		int n = arr.length;
		int max = arr[n-1];
		System.out.print(max+" ");
		for(int i=n-2; i>=0; i--){
		    if(max < arr[i]){
		        max=arr[i];
		        System.out.print(max+" ");
		    }
		}
	}
}