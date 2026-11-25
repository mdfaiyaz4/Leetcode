class Solution {
    public int rob(int[] a) {
        int n = a.length;
        if(n == 1) return a[0];
        if(n == 2) return Math.max(a[0],a[1]);
        
        return Math.max(helper(a,0,n-2),helper(a,1,n-1));
    }
    int helper(int a[], int st, int end){
        int dp[] = new int[a.length];
        dp[st] = a[st];
        dp[st+1] = Math.max(a[st],a[st+1]);
        
        for(int i=st+2; i<=end; i++){
        int pick = a[i] + dp[i-2];
        int npick = dp[i-1];
        dp[i] = Math.max(pick,npick);
        }
        return dp[end];
    }
}