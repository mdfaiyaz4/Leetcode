class Solution {
    public int pivotIndex(int[] a) {
        int tsum = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            tsum += a[i];
        }
        int curr = 0;
        for(int i=0;i<n;i++){
            
            if(curr == (tsum - curr - a[i])){
                return i;
            }
            curr += a[i];
        }
        return -1;
    }
}