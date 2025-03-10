//probem 1
//link:https://leetcode.com/problems/ugly-number/
class Solution {
    public boolean isUgly(int n) {
        int i;
        if(n==0)return false;
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        return (n==1);
    }
}
// problem2:-
// https://www.geeksforgeeks.org/problems/reverse-bits3556/1?page=1&category=Mathematical&difficulty=Easy&sortBy=submissions
class Solution {
    static Long reversedBits(Long x) {
        // code here
        long bit=0;
        int y,i=0;
        int arr[]=new int [32];
        while(x!=0){
            y=(int)(x%2);
            x/=2;
            arr[i++]=y;
        }
        while(i<32){
            arr[i++]=0;
        }
        for(int j=0;j<32;j++){
            bit+=arr[j]*Math.pow(2,32-j-1);
        }
        return bit;
    }
};
// approach: created an array of size 32 and stored the bit in it and calculate decimal value
// SC:O (n)
// TC:O(n)
