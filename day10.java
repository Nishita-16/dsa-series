leetcode potd:11/03/2025
link:https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/?envType=daily-question&envId=2025-03-11
class Solution {
    public int numberOfSubstrings(String s) {
        int i,count=0,a=0,b=0,c=0,j=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a')a++;
            else if(s.charAt(i)=='b')b++;
            else c++;
            while(a>0 && b>0 && c>0){
                count+=s.length()-i;
                if(s.charAt(j)=='a')a--;
                else if(s.charAt(j)=='b')b--;
                else c--;
                j++;
            }
            
        }
        return count;
    }
}
tc:O(N)
sc:O(1)
approch:calculate the count of a,b,c and when we have a,b,c>0 move one from left and count total pair from that.
que 1
link:https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i,j,k;
        int arr[]=new int[nums.length];
        j=1;
        k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[j]=nums[i];
                j+=2;
            }
            else{
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}
sc:O(N)
TC:O(N)
approach:if number is +ve , run a loop for that to add element at +2 diffence and same for negative number
que 3
link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
int maxProfit(int* nums, int numsSize) {
    int buy = nums[0];
        int profit = 0;
        for (int i = 1; i < numsSize; i++) {
            if (nums[i] < buy) {
                buy = nums[i];
            } else if (nums[i] - buy > profit) {
                profit = nums[i] - buy;
            }
        }
        return profit;

}
SC:O(1)
TC:O(N)
