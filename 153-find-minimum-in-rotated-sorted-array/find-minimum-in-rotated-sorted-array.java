class Solution {
    public int findMin(int[] a) {
        int n = a.length;int min = Integer.MAX_VALUE;
        int low  = 0, high = n-1, mid = 0;
        while(low < high){
            mid = low + (high - low)/2;
           if(a[mid] <= a[high]){
            high = mid;
           }
           else{
            low = mid + 1;
           }
        }
        return a[high];
    }
}