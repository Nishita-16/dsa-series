que 1: valid anagram leetcode
class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int [26];
        if(s.length()!=t.length()){
            return false;
        }
        int i;
        for(i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(i=0;i<s.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
  sc:O(n)
  tc:O(n)
  approach:used array to track for number of alphabet in s and t if they are equal their difference would give zero

que 2:longest common prefix leetcode
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i,j,len,min=Integer.MAX_VALUE,count=0;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<strs.length;i++){
            len=strs[i].length();
            min=Math.min(len,min);
        }
        for(i=0;i<min;i++){
            count=0;
            for(j=0;j<strs.length;j++){
                char x=strs[0].charAt(i);
                if(x==strs[j].charAt(i)){
                    count++;
                }
            }
            if(count==strs.length){
                sb.append(strs[0].charAt(i));
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
  sc:O(1)
  tc:O(n*m)// where m is the min length of string inside strs
