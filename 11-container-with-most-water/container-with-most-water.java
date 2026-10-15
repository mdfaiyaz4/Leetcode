class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int wt = 0;
        int max = 0,ht = 0, ans =0;
        int left=0, right = n-1;
        while(left < right){
            wt = right - left;
            ht = Math.min(a[left],a[right]);
            ans = wt * ht;
            max = Math.max(max, ans);
            if(a[left] < a[right]){
                left++;
            }
            else{
                right --;
            }
        }
        return max;
    }
}