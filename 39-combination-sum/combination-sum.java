class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        solve(a,ans,target,0,list,set);
        return ans;
    }
    void solve(int a[], List<List<Integer>> ans, int tar, int i,List<Integer> list,Set<List<Integer>> set){
        
        
        if(i == a.length || tar < 0){
            return;
        }
        if(tar == 0){
           if(!set.contains(list)){
            ans.add(new ArrayList<>(list));
            set.add(list);
            return;
           }
        }
        list.add(a[i]);
        solve(a,ans,tar-a[i],i+1,list,set); //single element
        solve(a,ans,tar-a[i],i,list,set); //Multiple Single Element

        list.remove(list.size() - 1);
        solve(a,ans,tar,i+1,list,set); //Do Not Take condn
    }
}