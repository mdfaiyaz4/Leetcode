class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;int i=0,j=0;
        while(i<n){
            if(a[i] != 0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;j++;
            }
            else{
                i++;
            }
        }
        
    }
}