// que 2
//problem link:https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int i,min=Integer.MAX_VALUE,max,diff;
        for(i=0;i<arr.size()-m+1;i++){
            diff=arr.get(m-1+i)-arr.get(i);
            min=Math.min(diff,min);
        }
        //min=Math.min(diff,min);
        return min;
    }
}
// TC:O(nlog n)
//SC:O(1)
//APPROCH: sorted the array and check possible combination and find min difference.
