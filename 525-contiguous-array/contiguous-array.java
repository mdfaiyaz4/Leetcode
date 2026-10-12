
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] first = new int[2 * n + 1];

        Arrays.fill(first, -2);
        first[n] = -1;

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            int index = sum + n;

            if (first[index] != -2) {
                maxLen = Math.max(maxLen, i - first[index]);
            } else {
                first[index] = i;
            }
        }

        return maxLen;
    }
}
