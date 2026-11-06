class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int left = 0 ,right = n-1;
        int max = 0; int wd = 0, ht = 0, area = 0;
        while(left < right){
            wd = right - left;
            ht = Math.min(a[left],a[right]);
            area = wd * ht;
            max = Math.max(max,area);
            if(a[left] < a[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}