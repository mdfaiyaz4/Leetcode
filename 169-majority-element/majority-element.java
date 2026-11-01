class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        int c = 0; int ele = a[0];
        for(int i=0;i<n;i++){
            
            
            if(ele == a[i]){
                c++;
            }
            else{
                c--;
            }
            if(c == 0){
                ele = a[i];
                c++;
            }
        }
        return ele;
    }
}