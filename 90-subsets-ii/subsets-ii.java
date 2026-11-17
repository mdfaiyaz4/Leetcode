class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int i=0;
        subset(nums,list, list2, i);
        return list2;
    }
    public void subset(int a[], List<Integer> list, List<List<Integer>> list2, int i ){
        if(i == a.length){
            list2.add(new ArrayList<>(list));
            return;
        }
        list.add(a[i]);
        subset(a,list,list2,i+1);

        list.remove(list.size() - 1);
       

        int idx = i+1;
        while(idx < a.length && a[idx] == a[idx-1]){
            idx++;
        }
         subset(a,list,list2,idx);
    }
}