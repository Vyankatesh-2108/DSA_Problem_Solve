//remove duplicate elements from sorted array
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5,6,6,6,6,6,7,7,7,8,8,8,9,9,9};
	    int[] nums = new int[arr.length];
	    int j=0;
        for(int i=0; i<arr.length-1; i++){
        if(arr[i] != arr[i+1])
            nums[j++] = arr[i];
        }
        nums[j++]=arr[arr.length-1];
        for(int i=0; i<j; i++)
            System.out.print(nums[i] +" ");
	}
}
