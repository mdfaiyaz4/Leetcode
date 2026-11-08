class Solution {
    public String reverseWords(String s) {
        int n = s.length(); int left = 0;
        StringBuilder sb = new StringBuilder();
        for(int right=0; right<n;right++){
            left = right;
            while(right < n && s.charAt(right) != ' '){
                right++;
            }   
            for(int i = right - 1; i >= left ; i--){
                sb.append(s.charAt(i));
            }
            if(sb.length() > 0){
                sb.append(" ");
            }
               
            
        }
        return sb.toString().trim();
    }
}