class Solution {
    public int maxArea(int[] a) {
        int max = Integer.MIN_VALUE;
        int sum =0,n = a.length;
        int left=0,right =n-1;
        while(left < right){
            int wt = right - left;
            int ht = Math.min(a[right],a[left]);
            if(a[left] > a[right]){
                right -- ;
            }
            else{
                left++;
            }
            sum = wt *ht;
            max = Math.max(sum,max);
        }
        return max;
    }
}