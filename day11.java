que 1:pascal's triangle leetcode
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i,j;
        List <List<Integer>> list=new ArrayList <>();
        ArrayList <Integer> list1=new ArrayList <>();
        ArrayList <Integer> list2=new ArrayList <>();
        list1.add(1);
        list.add(list1);
        if(numRows==1)return list;
        list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list.add(list1);
        if(numRows==2)return list;
        for(i=2;i<numRows;i++){
            list2.add(1);
            for(j=0;j<list1.size()-1;j++){
                list2.add(list1.get(j)+list1.get(j+1));
            }
            list2.add(1);
            list.add(list2);
            list1 = new ArrayList<>();
            for(j=0;j<list2.size();j++){
                list1.add(list2.get(j));
            }
            list2= new ArrayList<>();
        }
        return list;
    }
}
sc:O(n*n)
tc:O(n*n)
