class Solution {
    public List findDisappearedNumbers(int[] a) {
        int n = a.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int index = Math.abs(a[i]) -1;
            a[index] = -Math.abs(a[index]);
        }
        for(int i=0;i<n;i++){
            if(a[i] > 0){
               list.add(i+1);
            }
        }
        return list;
    }
}