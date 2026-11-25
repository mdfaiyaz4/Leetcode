class Solution {
    public int rob(int[] a) {
        int n = a.length;
        if(n == 1) return a[0];
        if(n == 2) return Math.max(a[0],a[1]);
        
        int dp1[] = new int[n];
        Arrays.fill(dp1,-1);
        int dp2[] = new int[n];
        Arrays.fill(dp2,-1);
        
        return Math.max(helper(a,0,n-2,dp1),helper(a,1,n-1,dp2));
    }
    int helper(int a[], int st, int end,int dp[]){
        dp[0] = a[st];
        dp[1] = Math.max(a[st],a[end]);
        if(st > end) return 0;
        if(dp[end] != -1) return dp[end];
        int pick = a[end] + helper(a,st,end-2,dp);
        int npick = helper(a,st,end-1,dp);
        return dp[end] = Math.max(pick,npick);
    }
}