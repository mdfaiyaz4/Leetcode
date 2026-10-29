class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        right(a,0,n-1);
        right(a,0,k-1);
        right(a,k,n-1);

    }
    public void right(int a[], int s, int e){
        while(s < e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;e--;
        }
    }
}