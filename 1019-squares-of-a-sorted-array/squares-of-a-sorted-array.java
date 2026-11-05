class Solution {
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int i=0;
        for(i=0;i<n;i++){
            a[i] = a[i]*a[i];
        }Arrays.sort(a);
        return a;
    }
}