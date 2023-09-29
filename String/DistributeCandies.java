//Distribute Candies

class Solution {
    public int distributeCandies(int[] candyType) {
      Set<Integer> s = new HashSet<>();
      int n = candyType.length/2;  
      for(int a : candyType){
        if(s.size() >= n)
          return n;
        s.add(a);
      }
      return Math.min(s.size(), n);
    }
}