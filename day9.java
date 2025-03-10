que 1
problem link:https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int i;
        for(i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i])){
                arr[0]=map.get(k-nums[i]);
                arr[1]=i;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
approch:using hashmap to store key and valie pair
que 2
problem link:
