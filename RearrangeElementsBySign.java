public class Main
{
	public static void main(String[] args) {
	    int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int arr1[]= new int[arr.length];
		int arr2[]= new int[arr.length];
		
        int i=0;
        int n1=arr1.length;
        int j=0;
       
        int n2=arr2.length;
        int k=0;
        
        for( i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr1[j++]=arr[i];
            }else{
                arr2[k++]=arr[i];
            }
        }
        
        int a=0, b=0, c=0;
        while(a<j && b<k){
            arr[c] = arr1[a];
            c++;
            arr[c] = arr2[b];
            c++;
            a++;
            b++;
        }
        
        while(a < j){
            arr[c]=arr1[a];
            a++;
            c++;
        }
    
        while(b < k){
            arr[c]=arr2[b];
            b++;
            c++;
        }
        
        System.out.println();
        for(int i1=0; i1<c; i1++)
            System.out.print(arr[i1] + " ");
        
	}
}

//-5, 5, -2, 2, -8, 4, 7, 1, 8, 0
