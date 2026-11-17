class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        int i=0;
        subset(nums,list,list2,i);
        return list2;
    }
    public static void subset(int a[], List<Integer> list, List<List<Integer>> list2, int i){
        if(i == a.length){
            list2.add(new ArrayList<>(list));
            return;
        }
        list.add(a[i]);
        subset(a,list,list2,i+1); 

         list.remove(list.size() - 1);
         subset(a,list,list2,i+1);
    }
}