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
