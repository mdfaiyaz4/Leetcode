class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
       
        return helper(nums,dp,n-1);
    }
    int helper (int a[], int dp[], int n){
        
        if(n == 0){
            return a[0];
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int pick = helper(a,dp,n-2) + a[n];
        int notpick = helper(a,dp,n-1);
        return dp[n] = Math.max(pick,notpick);
    }
}