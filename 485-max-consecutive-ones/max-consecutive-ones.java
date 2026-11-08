class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int n = a.length;
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < n) {

            if (a[right] == 1) {
                right++;
            } else {
                max = Math.max(max, right - left);
                right++;
                left = right;
            }
        }

        max = Math.max(max, right - left);

        return max;
    }
}