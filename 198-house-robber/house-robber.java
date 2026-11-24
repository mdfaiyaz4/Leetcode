class Solution {
    public int rob(int[] a) {
        int n = a.length;
        int dp[] = new int[n];
        if(n == 0)return 0;
        if(n == 1) return a[0];
        Arrays.fill(dp,-1);
        dp[0] = a[0];
        dp[1] = Math.max(a[0],a[1]);
        for(int i=2; i<n; i++){
            if(dp[i] != -1){
                return dp[i];
            }
            int pick = a[i] + dp[i-2];
            int npick = dp[i-1];
            dp[i] = Math.max(pick,npick);
        }
        return dp[n-1];
    }
}