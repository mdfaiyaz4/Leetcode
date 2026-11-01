class Solution {
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        int low = 0, high = n-1 , mid = 0;
        while(low < high){
            
            if(a[low] + a[high] > target){
                high --;
            }
            else if(a[low] + a[high] < target){
                low++;
            }
            else{
                return new int[] {low+1,high+1};
            }
        }
        return new int[] {-1};
    }
}