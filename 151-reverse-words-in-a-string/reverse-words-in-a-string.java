class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            // Find the beginning of the word
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add space between words
            if (ans.length() > 0) {
                ans.append(" ");
            }

            // Append the word
            ans.append(s.substring(i + 1, j + 1));
        }

        return ans.toString();
    }
}