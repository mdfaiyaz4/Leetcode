class Solution {
    public int longestOnes(int[] a, int k) {
        int n = a.length;
        int z =0, max= 0;
        int left = 0, right = 0;
       while(right < n){
        if(a[right] == 0){
            z++;
        }
        if(z > k){
            if(a[left] == 0){
                z--;
            }
                left++;
            
        }
        if(z <= k){
            max = Math.max(right - left + 1, max);
        }
        right++;
       }
       return max;
    }
}