class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i] - min);
        }
        return max;
    }
}