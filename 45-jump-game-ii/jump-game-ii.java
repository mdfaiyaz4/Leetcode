class Solution {
    public int jump(int[] a) {
        int n= a.length;
        int left = 0, right = 0,jump = 0;
        while(right < n-1){
            int farthest = 0;
            for(int i=left; i<=right; i++){
                farthest = Math.max(farthest, i+a[i]);
            }
            left = right + 1;
            right = farthest;
            jump++;
        }
        return jump;
    }
}