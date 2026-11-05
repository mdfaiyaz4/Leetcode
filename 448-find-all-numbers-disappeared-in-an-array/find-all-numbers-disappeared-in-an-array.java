class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        List<Integer> list = new ArrayList<>();
        int n = a.length;
       // HashMap<Integer,Integer> map = new HashMap<>();
       int fre[] = new int[n+1];
       for(int i=1;i<=n;i++){
        fre[i]++;
       }
       for(int i=0;i<n;i++){
        fre[a[i]]--;
       }
       for(int j=1;j<=n;j++){
        if(fre[j] == 1){
            list.add(j);
        }
       
       }
       return list;
    }
}