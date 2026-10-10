class Solution {
    public int pivotIndex(int[] a) {
        int total = 0;
        int left = 0;
        for(int i:a){
            total+=i;
        }
        for(int i=0;i<a.length; i++){
            if(left == total - left - a[i]){
                return i;
            }
            left += a[i];
        }
        return -1;
    }
}