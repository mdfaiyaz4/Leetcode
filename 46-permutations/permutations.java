class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        perm(nums, list, 0);
        return list;
    }
    public static void perm(int a[], List<List<Integer>> list, int i){
        if(i == a.length){
            List<Integer> t = new ArrayList<>();
            for(int k:a){
                t.add(k);
            }
            list.add(t);
            return;
        }
        for(int j=i; j<a.length; j++){
            int temp = a[i]; 
            a[i] = a[j];
            a[j] = temp;
            
            perm(a,list,i+1);
            
             temp = a[i]; 
            a[i] = a[j];
            a[j] = temp;
        }
        
    }
}