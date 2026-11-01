class Solution {
    public int removeElement(int[] a, int val) {
        int n = a.length;int j=0;
        for(int i=0;i<n;i++){
            if(a[i] != val){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                j++;
            }
        }
        return j;
    }
}