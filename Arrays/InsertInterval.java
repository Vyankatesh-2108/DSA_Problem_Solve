//Insert Interval

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        
        while (i < intervals.length) {
            if (intervals[i][1] < newInterval[0])
                result.add(intervals[i]);
            else if (intervals[i][0] > newInterval[1]){
                break;
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            i++;
        }
        
        result.add(newInterval);
        while (i < n){
            result.add(intervals[i++]);
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}