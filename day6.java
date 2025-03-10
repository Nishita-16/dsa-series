leetcode potd 
date:07/03/2025
problem link:https://leetcode.com/problems/closest-prime-numbers-in-range/solutions/?envType=daily-question&envId=2025-03-07
que1
probltm link:https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack <Integer> stk=new Stack<>();
        ArrayList <Integer> list=new ArrayList <>();
        int i,j;
        for(i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                list.add(i+1);
            }
            else{
                list.add(i-stk.peek());
            }
            stk.push(i);
        }
        return list;
    }
}
