class Solution {
    public int searchInsert(int[] a, int t) {
        int n = a.length;
        int low = 0, high = n-1, mid =0;
        while(low <= high){
            mid = low +(high - low)/2;
            if(a[mid] == t){
                return mid;
            }
            else if(a[mid] < t){
                low = mid +1;
                
            }
            else{

                high = mid -1;
            }
        }
        return  low;
    }
}