class Solution {
    public int[] replaceElements(int[] a) {
        int n = a.length;
        int max = a[n-1],lmax = 0;
        a[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            max = Math.max(max,lmax);
            lmax = Math.max(lmax,a[i]);
            a[i] = Math.max(max,a[i+1]);
        }
        return a;
    }
}