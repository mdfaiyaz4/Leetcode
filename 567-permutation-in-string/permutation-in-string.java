class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int m = s1.length();
        int a[] = new int[26];
        int b[] = new int[26];
        int window = m;
        if(n < m){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            a[ch - 'a']++;
        }
        for(int i=0;i<window;i++){
            char ch = s2.charAt(i);
            b[ch - 'a']++;
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        for(int i=window;i<n;i++){
            char ch = s2.charAt(i);
            char ch1 = s2.charAt(i- window);
            b[ch - 'a']++;
            b[ch1 - 'a']--;
            if(Arrays.equals(a,b)){
                return true;
            }
        }
        return false;
    }
}