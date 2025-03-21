problem 1:https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
class Solution {
    public int maxDepth(String s) {
        Stack <Character> stk=new Stack <>();
        int count=0,max=Integer.MIN_VALUE;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push('(');
                count++;
            }
            else if(s.charAt(i)==')'){
                stk.pop();
                max=Math.max(count,max);
                count--;
                if(stk.isEmpty()){
                    count=0;
                }
            }
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
    }
}
sc:O(n)
tc:O(n)
approach: created an stack for keep track for depth and return the maximum value.
problem 2:https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        int i,num=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='M'){
                num+=1000;
            }
            else if(i<s.length()-1 &&  s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                num+=900;
                i++;
            }
            else if(s.charAt(i)=='D'){
                num+=500;
            }
            else if(i<s.length()-1 &&  s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                num+=400;
                i++;
            }
            else if(s.charAt(i)=='C'){
                num+=100;
            }
            else if(i<s.length()-1 &&  s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                num+=90;
                i++;
            }
            else if(s.charAt(i)=='L'){
                num+=50;
            }
            else if(i<s.length()-1 &&  s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                num+=40;
                i++;
            }
            else if(s.charAt(i)=='X'){
                num+=10;
            }
            else if(i<s.length()-1 && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                num+=9;
                i++;
            }
            else if(s.charAt(i)=='V'){
                num+=5;
            }
            else if(i<s.length()-1 && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                num+=4;
                i++;
            }
            else{
                num++;
            }
        }
        return num;
    }
}
sc:O(1)
tc:O(n)
approach: iterate through whole string and add value of corresponding character
