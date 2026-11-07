class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int hash[] = new int[256];

        Arrays.fill(hash, -1);

        int left = 0;
        int max = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            if (hash[ch] >= left) {
                left = hash[ch] + 1;
            }

            hash[ch] = right;

            int len = right - left + 1;

            max = Math.max(max, len);
        }

        return max;
    }
}