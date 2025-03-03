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
