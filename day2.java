// leetcode POTD 03/03/2025
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i,pidx=0,nidx=0,curridx;
        int arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]<=pivot){
                pidx++;
            }
        }
        curridx=pidx-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[nidx++]=nums[i];
            }
            else if(nums[i]==pivot){
                arr[curridx--]=nums[i];
            }
            else{
                arr[pidx++]=nums[i];
            }
        }
        return arr;
    }
}
//sc:O(N)
//tc:O(N)
que 2
//problem link:2570-https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i,j,idx=0,len=0;
        int resarr[][]=new int[nums1.length+nums2.length][2];
        for(i=0,j=0;i<nums1.length&&j<nums2.length;idx++){
            if(nums1[i][0]>nums2[j][0]){
                resarr[idx][0]=nums2[j][0];
                resarr[idx][1]=nums2[j][1];
                j++;
            }
            else if(nums1[i][0]==nums2[j][0]){
                resarr[idx][0]=nums1[i][0];
                resarr[idx][1]=nums2[j][1]+nums1[i][1];
                j++;
                i++;
            }
            else{
                resarr[idx][0]=nums1[i][0];
                resarr[idx][1]=nums1[i][1];
                i++;
            }
        }
        while (i < nums1.length) {
            resarr[idx][0] = nums1[i][0];
            resarr[idx][1] = nums1[i][1];
            i++;
            idx++;
        }

        while (j < nums2.length) {
            resarr[idx][0] = nums2[j][0];
            resarr[idx][1] = nums2[j][1];
            j++;
            idx++;
        }
        int resarr2[][]=new int[idx][2];
        for(i=0;i<idx;i++){
            resarr2[i][0]=resarr[i][0];
            resarr2[i][1]=resarr[i][1];
        }
        return resarr2;
    }
}
//tc:O(n)
//sc:O(n)
