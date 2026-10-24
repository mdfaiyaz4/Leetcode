class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; int prod = 1;
        int a[] = new int[nums.length];
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        a[0] = 1;
        suffix[n-1] = 1;
        for(int i=1;i<n;i++){
            a[i] = a[i-1] * nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i = 0;i<n;i++){
            a[i] = a[i]* suffix[i];
        }
        return a;
       
    }
}