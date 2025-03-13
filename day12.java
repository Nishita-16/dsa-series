que 2:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        int arr[]=new int [2];
        arr[0]=-1;
        arr[1]=-1;
        while(right>=left){
            mid=(left+right)/2;
            if(target==nums[mid]){
                int l=mid;
                int r=mid;
                while(l>=0 && nums[l]==target){
                    l--;
                }
                arr[0]=l+1;
                while(r<nums.length && nums[r]==target){
                    r++;
                }
                arr[1]=r-1;
                return arr;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return arr;
    }
}
sc:O(1)
tc:O(logn)
approch:use binary search and if target is found than check for start and ending index of element
que 3:https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,ind=0,mid;
        while(right>=left){
            mid=(left+right)/2;
            if(nums[mid]==target){
                int l=mid;
                while(l>=0 && target==nums[l]){
                    l--;
                }
                return l+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}
sc:O(1)
tc:O(logn)
approch:use binary search and if target is found than return target else if not found when right>left so off course the left index must be correct postn for the element to be inserted
