//leetcode potd 08/03/2025
//problem link:https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/?envType=daily-question&envId=2025-03-08
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i,count=0,w=0,b=0,min=Integer.MAX_VALUE;
        for(i=0;i<blocks.length()-k+1;i++){
            w=0;
            for(int j=i;j<k+i;j++){
                if(blocks.charAt(j)=='W'){
                    w+=1;
                }
            }
            min=Math.min(w,min);
        }
        return min;
    }
}
//time complexity:O(n*k)
//sc:O(1)
