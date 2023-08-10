//pair addition

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 1, 3, -1, 7, -5};
		int k=2, count=0;
        for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
           if(arr[i] + arr[j] == k)
                 count++;
        }
        }
        System.out.println(count);
	}
}