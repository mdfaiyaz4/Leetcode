class Solution {
    public int trap(int[] a) {
        int n = a.length, rrm = 0, lm = 0;
        int max = 0; int lmax[] = new int[n];
        int rmax[] = new int [n];
        lmax[0] = a[0];
        rmax[n-1] = a[n-1];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1],a[i]);
        }
        for(int i=n-2; i>=0;i--){
            rmax[i] = Math.max(rmax[i+1],a[i]);
        }
        for(int i=0; i<n;i++){
            max =Math.min(lmax[i],rmax[i]) - a[i];
            lm +=max;
        }
        return lm;
    }
}