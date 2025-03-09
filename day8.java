//que 1
//problem link:https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int snowball=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                snowball+=1;
            }
            else if(snowball>0){
                int t=nums[i];
                nums[i]=0;
                nums[i-snowball]=t;
            }
        }
    }
}
//sc:O(1)
//tc:O(n)

//que 2
//problem link:https://leetcode.com/problems/rotate-array/submissions/1508811948/
class Solution {
    public void rotate(int[] nums, int k) {
        int numsSize=nums.length,i;
        int arr[]=new int[numsSize];
        while(numsSize<k){
            k-=numsSize;
        }
        if(numsSize>k){
            for(i=0;i<numsSize-k;i++){
                arr[k+i]=nums[i];
              }
            for(i=0;i<k;i++){
                arr[i]=nums[numsSize-k+i];
              }
        for(i=0;i<numsSize;i++){
                nums[i]=arr[i];
            }
        }
    }
}
sc:O(n)
tc:O(n)
