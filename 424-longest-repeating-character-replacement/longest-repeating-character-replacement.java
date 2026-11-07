class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int ans = 0, max = 0;
        int a[] = new int[26];
        for(int right = 0; right<n; right ++){
            char ch = s.charAt(right);
            a[ch - 'A']++;
            max = Math.max(max, a[s.charAt(right)- 'A']);
            if(k < right - left + 1 - max){
                a[s.charAt(left)- 'A']--;
                left++;
            }
            ans = Math.max(ans, right -left +1);
        }
        return ans;
        
    }
}