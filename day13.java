que 1:leetcode find minimum in rotated sorted array
class Solution {
    public int findMin(int[] nums) {
        int i,j,right=nums.length-1,left=0,min=Integer.MAX_VALUE,mid=0;
        while(right>left){
            mid=(left+right)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }          
        }
        return nums[left];
    }
}
sc:O(1)
tc:(logn)
que 2:search in rotated soretd array
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target==nums[high])return high;
            
            else if(nums[low]<nums[mid]){
                if(target<=nums[mid]&&target>=nums[low]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
sc:O(1)
tc:O(log n)
