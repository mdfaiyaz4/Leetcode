class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right =0,len = 0, max = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for( right = 0; right<n;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            len = right - left +  1;
            max = Math.max(max,len);

        }
        return max;
    }
}