class Solution {
    public int[] searchRange(int[] a, int target) {
        int n = a.length;
        int low = 0, high = n-1, mid = 0,k=0;
        int ans[] = new int[2];Arrays.fill(ans,-1);
        while(low <= high){
            mid = low + (high - low)/2;
            if(a[mid] == target){
                ans[0] = mid;
                high = mid -1;
            }
            else if(a[mid] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        low = 0; high = n-1; mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(a[mid] == target){
                ans[1] = mid;
                low = mid +1;
            }
            else if(a[mid] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }

        return ans;
    }
}