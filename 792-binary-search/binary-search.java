class Solution {
    public int search(int[] a, int t) {
        int n = a.length;
        int start = 0, end = n-1;
        return comp( a,  start,  end,  t);
    }
    public static int comp(int a[], int s, int e, int t){
        int mid = s + (e-s)/2;
        if(s <=e){
        if(a[mid] == t){
            return mid;
        }
        else if(a[mid] > t){
            return comp(a,s,mid-1,t);
        }
        else{
            return comp(a,mid+1,e,t);
        }
        }
        else return -1;
    }
}