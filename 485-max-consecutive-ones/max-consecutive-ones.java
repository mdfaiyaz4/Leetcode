class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int n = a.length;
        int count = 0,max =0, i= 0;
        while(i<n){
            count = 0;
            while(a[i] == 1){
                count++;
                i++;
                if(i>=n){
                    break;
                }
            }
            max = Math.max(max,count );
            if(i>=n)   {
                break;
            }
            while(a[i] != 1){
            i++;  
            if(i>=n)   {
                break;
            }
            }
        }
        return max;
    }
}