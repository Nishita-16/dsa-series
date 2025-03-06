//leetcode potd:06/03/2025
//link:https://leetcode.com/problems/find-missing-and-repeated-values/?envType=daily-question&envId=2025-03-06
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet <Integer> set=new HashSet <>();
        int arr[]=new int[2];
        int i,j;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    arr[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        int k=1;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(set.contains(k++)){
                    continue;
                }
                else{
                    arr[1]=--k;
                    break;
                }
            }
        }
        return arr;
    }
}
//tc:O(n*m)
//sc:O(n*m)
