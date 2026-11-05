class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0; int i=0, j=0;int c[] = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] > nums2[j]){
                c[k++] = nums2[j];
                j++;
            }
            else if(nums1[i]<nums2[j]){
                c[k++] = nums1[i];
                i++;
            }
            else 
            {
                c[k++] = nums1[i++];
            }
            
        }
        while(i<m){
            c[k++] = nums1[i++];
        }
        while(j<n){
            c[k++] = nums2[j++];
        }
        for(int l = 0;l<m+n; l++){
            nums1[l] = c[l];
        }
    }
}