Question_1 :
https://leetcode.com/problems/isomorphic-strings/description/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int i;
        HashMap <Character,Character> map=new HashMap<>();
        for(i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
sc:O(n)
tc:O(n)
  approach: created a hashmap to check for which char point to which , if it point to another we return false
Question_2 :
https://leetcode.com/problems/remove-outermost-parentheses/description/
class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> stk=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                //stk.pop();
                if(!stk.isEmpty()){
                    sb.append('(');  
                
                }
                stk.push('(');
            }
            
            else if(s.charAt(i)==')' ){
                stk.pop();
                if(!stk.isEmpty()){
                        sb.append(')');  
                }
                
            }
        }
        String st=sb.toString();
        return st;
    }
}
sc:O(n)
tc:O(n)
approach: created a stack and store the paranthes and if closing bracket is there we pop it , store it in a string and if pop makes stack empty than we dont include in string
