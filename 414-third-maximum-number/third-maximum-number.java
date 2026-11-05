class Solution {
    public int thirdMax(int[] a) {
        int n = a.length;
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        if(n == 1){
            return a[0];
        }
        if(n == 2){
            return Math.max(a[0],a[1]);
        }

        for(int i=0;i<n;i++){
            if(a[i] == max || a[i] == smax || a[i] == tmax){
                continue;
            }
            if(a[i] > max){
                tmax = smax;
                smax = max;
                max = a[i];
            }
            else if(a[i] < max && a[i] > smax){
                tmax = smax;
                smax = a[i];
            }
            else if(a[i] < smax && a[i] > tmax){
                tmax = a[i];
            }
        }
        if(tmax == Long.MIN_VALUE){
            
            return(int) max;
        }
        return (int)tmax;
    }
}