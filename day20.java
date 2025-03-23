problem link:https://leetcode.com/problems/sort-characters-by-frequency/submissions/1582785289/
class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> map=new HashMap <>();
        HashMap<Integer, ArrayList<Character>> mp = new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int i;
        ArrayList <Integer> list1=new ArrayList<>();
        for(i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            int val=map.get(key);
            if(!mp.containsKey(val)){
                ArrayList <Character> list=new ArrayList<>();
                mp.put(val,list);
            }
            mp.get(val).add(key);
        }
        for(Integer key:mp.keySet()){
            list1.add(key);
        }
        Collections.sort(list1);
        for(i=list1.size()-1;i>=0;i--){
            ArrayList <Character> temp=new ArrayList<>();
            temp=mp.get(list1.get(i));
            for(int j=0;j<temp.size();j++){
                for(int k=0;k<list1.get(i);k++){
                    sb.append(temp.get(j));
                }
                
            }
        }
        return sb.toString();
    }
}
problem 2:https://leetcode.com/problems/string-to-integer-atoi/description/
class Solution {
    public int myAtoi(String s) {
        int num=0,i=0,count=1,ws=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(ws!=i){
                    break;
                }
                ws++;
            }
            else if((s.charAt(i)=='-' || s.charAt(i)=='+') && i==ws){
                if(s.charAt(i)=='-')
                count=-1;
            }
            else if('0'<=s.charAt(i) && s.charAt(i)<='9'){
                int x=s.charAt(i)-'0';
                if (num > (Integer.MAX_VALUE - x) / 10) {
                return count == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
                num=x+num*10;
            }
            else{
                break;
            }
        }
        return num*count;
    }
}
