class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        StringBuilder sb= new StringBuilder(s);
        sb = sb.reverse(); String ans = "";
        
        for(int i=0;i<n;i++){
            if(sb.charAt(i) == ' '){
                continue;
            }
           StringBuilder word= new StringBuilder("");
            while(i < n && sb.charAt(i) != ' '){
                word.append(sb.charAt(i));
                i++;
            }
            word = word.reverse();
            
            ans +=" "+ word;
                
            
        }
        return ans.substring(1);
    
    }
    
    
}