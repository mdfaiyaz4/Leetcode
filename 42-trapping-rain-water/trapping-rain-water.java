class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int left = 0, right = n-1;
        int lm = 0, rm = 0,i=0;
        int ans =0;
        while(left < right){
            lm = Math.max(lm,a[left]);
            rm = Math.max(rm, a[right]);
            if(lm < rm){
                ans += lm - a[left];
                left++;
            }
            else {
                ans += rm - a[right];
                right--;
            }
        }
        return ans;
    }
}