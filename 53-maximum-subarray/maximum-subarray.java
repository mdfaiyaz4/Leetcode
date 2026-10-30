class Solution {
    public int maxSubArray(int[] a) {
        int sum = a[0]; int n = a.length;int max = a[0];
        if(n == 1){
            return a[0];
        }
        for(int i=1; i<n;i++){
           sum = Math.max(a[i],sum +a[i]);
           max = Math.max(sum,max);

        }
        return max;
    }
}