//leetcode potd 05/05/2025
//link:https://leetcode.com/problems/count-total-number-of-colored-cells/?envType=daily-question&envId=2025-03-05
class Solution {
    public long coloredCells(int n) {
        long x=0;
        while(n!=1){
            x+= (--n)*4;
        }
        return x+1;
    }
}
//tc:O(n)
//sc:O(n)
//or tc:O(n)
class Solution {
    public long coloredCells(int n) {
        long x=0;
        while(n!=1){
            x+= (--n)*4;
        }
        return x+1;
    }
}

//que 1
//problem link:
class Solution {
    public int distinctIntegers(int n) {
        return n>1?n-1:1;
    }
}
TC:O(1)
SC:O(1)
approach:as n%i must be =1 so it will the number before it and so on for the same number
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
