problem link:https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,wrong=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    wrong++;
                }
            }
        }
        return wrong+open;
    }
}
// or using stack
class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> stk=new Stack <>();
        int i,count=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push('(');
            }
            else if(s.charAt(i)==')'){
                if(stk.size()>0 && stk.peek()=='('){
                    stk.pop();
                }else{
                    stk.push(')');
                }
                
            }
        }
        return stk.size();
    }
}
