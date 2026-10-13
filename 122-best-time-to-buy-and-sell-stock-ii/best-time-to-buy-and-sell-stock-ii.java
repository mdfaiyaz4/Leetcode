class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int max = 0,sum=0;
        for(int i=1; i<n;i++){
            if(a[i] > a[i-1]){
                sum = a[i] - a[i-1];
                max = Math.max(sum + max,max);
            }
        }
        return max;
    }
}