//Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>(); 
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i] == arr1[j])
                    ls.add(arr2[i]);
            }
            ls2.add(arr2[i]);
        }
        Arrays.sort(arr1);
        for(int i=0; i<arr1.length; i++){
            if(!ls2.contains(arr1[i]))
                ls.add(arr1[i]);
        }
        int[] ar = new int[ls.size()];
        int k=0;
        for(int i=0; i<ls.size(); i++){
            ar[k]=ls.get(i);
            k++;
        }
        return ar;
    }
}   