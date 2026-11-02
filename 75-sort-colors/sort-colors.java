class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int low = 0, mid = 0 , high = n-1;
        if(n == 1){
            return ;
        }
        while(mid <= high){
            if(a[mid] == 0){
                int t = a[mid];
                a[mid] = a[low];
                a[low] = t;
                low++; mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else if(a[mid] == 2){
                int t = a[mid];
                a[mid] = a[high];
                a[high] = t;
                high--;
            }
        }
    }
}