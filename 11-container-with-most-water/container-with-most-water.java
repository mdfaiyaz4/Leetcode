class Solution {
    public int maxArea(int[] a) {
     int n = a.length;
     int max = 0;
    int left =0, right= n-1;
    while(left < right){
        int wt = right - left; 
        int h = Math.min(a[left], a[right]);
        if(a[left] > a[right]){
            right--;
        }
        else{
            left++;
        }
        max = Math.max(max,wt*h);
    }
    return max;
    }
}