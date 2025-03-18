leetcode potd:17/03/2025
link:https://leetcode.com/problems/divide-array-into-equal-pairs/?envType=daily-question&envId=2025-03-17
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
tc:O(nlogn)
sc:O(1)
approach:sort the array and check for consecutive elements are equal or not
que 2
problem: search in 2d matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lenrow=matrix.length,lencol=matrix[0].length;
        int i,j,left=0,right=lenrow*lencol-1,mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            int midval = matrix[mid / lencol][mid % lencol];
            if(midval==target){
                return true;
            }
            else if(midval<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return false;
    }
}
sc:O(1)
tc:O(log(m*n))
approach:used binary search to check if element is present or not
