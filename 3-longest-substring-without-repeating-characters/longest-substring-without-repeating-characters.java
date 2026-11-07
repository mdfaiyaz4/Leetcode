class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); int len =0;
        int max = 0; int hash[] = new int[256];
        if(n == 0 || n == 1){
            return n;
        }
        for(int i=0;i<n;i++){
            Arrays.fill(hash,0);
            for(int j =i; j<n;j++){
                char ch = s.charAt(j);
                if(hash[ch] == 1){
                    break;
                }
                len = j - i+1 ;
                max = Math.max(max,len);
                
                hash[ch] = 1;
                
            }
        }
        return max;
    }
}