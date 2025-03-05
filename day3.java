// leet code POTD 04/03/2025
class Solution {
    public boolean checkPowersOfThree(int n) {
        ArrayList <Integer> list=new ArrayList<>();
        int i,num=0,number=n;
        while(n>=1){
            int x=n%3;
            list.add(x);
            n/=3;
        }
        for(i=0;i<list.size();i++){
            if(list.get(i)==0){
                continue;
            }
            num+=(Math.pow(3,i));
        }
        return(num==number);
    }
}
//sc:O(logn)
//tc:O(logn)
// que 2
// problem link:https://leetcode.com/problems/flipping-an-image/
class Solution {
    public void flip(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)arr[i]=0;
            else arr[i]=1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int i;
        for(i=0;i<image.length;i++){
            flip(image[i]);
        }
        return image;
    }
}
//tc:O(n*m)
//sc:O(1)
