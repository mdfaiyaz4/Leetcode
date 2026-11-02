class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int n = a.length;
        int min = Integer.MAX_VALUE;int sum =0; 
        int left = 0, right = 0;
        while( right < n){
            sum += a[right];
            while(sum >= t){
                min = Math.min(min,right-left+1);
                sum -= a[left];
                left++;
            }
            right++;
        }
        if(min == Integer.MAX_VALUE){
            min = 0;
        }
        return min;
    }
}