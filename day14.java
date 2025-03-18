que 1
problem link:https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        //int i;
        long i=(long) Math.sqrt(n);
        return (int)i;
    }
}
sc:O(1)
tc:O(1)
approach:used math.sqrt function
que 3
problem link:https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
class Solution {
    public int finddivisor(int nums[],int mid){
        int y=0;
        for(int x:nums){
            y+=(x+mid-1)/mid;
        }
        return y;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int i,left=1,right,max=nums[0],ans=-1,mid;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        right=max;
        while(left<=right){
            mid=(left+right)/2;
            int x=finddivisor(nums,mid);
            if(x<=threshold){
                ans=mid;        
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
approach:use binary search between 1 and largest element in the array
sc:O(1)
tc:O(n*log(max el))
