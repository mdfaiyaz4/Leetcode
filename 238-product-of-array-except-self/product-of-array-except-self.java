class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; int prod = 1;
        int a[] = new int[nums.length];
      
        int suffix = 1;
        a[0] = 1;
        
        for(int i=1;i<n;i++){
            a[i] = a[i-1] * nums[i-1];
        }
       
        for(int i=n-2; i>=0; i--){
            suffix *= nums[i+1];
            a[i] *= suffix;
        }
        
        return a;
       
    }
}