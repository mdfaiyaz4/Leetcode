class Solution {
    public int findContentChildren(int[] child, int[] cookie) {
        int n = child.length;
        int m = cookie.length;int max = 0;
        int i = 0, j = 0;
        Arrays.sort(child);
        Arrays.sort(cookie);
        while(i < n && j < m){
            if(child[i] <= cookie[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}