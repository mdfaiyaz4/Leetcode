class Solution {
    public int mySqrt(int x) {
       int low = 0;int ans = 0;
       int high = x/2;
       int mid = 0;
       if(x < 2){
        return x;
       }
       while(low <= high){
        mid = low +(high - low)/2;
        long sq = (long)mid * mid;
        if(sq == x){
            return mid;
        }
        else if(sq < x){
            ans = mid;
            low = mid +1;
        }
        else{
            high = mid-1;
        }

       }
       return ans;
    }
}