problem link:https://leetcode.com/problems/partition-labels/
class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList <Integer> list=new ArrayList <>();
        int[] map=new int[26];
        int i,idx=0,max=0;
        for(i=0;i<s.length();i++){
            map[s.charAt(i)-'a']=i;
        }
        int start=0;
        for(i=0;i<s.length();i++){
           idx=map[s.charAt(i)-'a'];
           max=Math.max(idx,max);
           if(i==max){
                list.add(max-start+1); 
                start=max+1;
           }
        }
        return list;
    }
}
