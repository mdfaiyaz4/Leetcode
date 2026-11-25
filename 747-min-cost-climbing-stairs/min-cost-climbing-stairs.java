class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        if(n == 2){
            return Math.min(cost[0],cost[1]);
        }
        int dp[] = new int [n];
        Arrays.fill(dp,-1);
        int a = solve(cost,0,dp);
        Arrays.fill(dp,-1);
        int b = solve(cost,1,dp);
        return Math.min(a,b);
    }
    int solve(int cost[],int i,int dp[]){
       
        if(i >= cost.length) return 0;
        if(dp[i] != -1){
            return dp[i];
        }
        int a = cost[i] + solve(cost,i + 1,dp);
        int b = cost[i] + solve(cost,i+2,dp);
        return dp[i] = Math.min(a,b);

    }
}