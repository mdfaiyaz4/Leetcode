class Solution {
    public double findMaxAverage(int[] a, int k) {
        int n = a.length; double sum = 0;
        double avg = 0.0, max = 0.0;
        if(n == 1){
            return (double)a[0];
        }
        for(int i=0;i<k;i++){
            sum += a[i];
        }
        avg = sum/k;
        max = avg;
        for(int i=k;i<n;i++){
            sum += a[i] -a[i-k];
            avg = sum / k;
            max = Math.max(max,avg);
        }
        return max;
    }
}