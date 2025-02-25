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
