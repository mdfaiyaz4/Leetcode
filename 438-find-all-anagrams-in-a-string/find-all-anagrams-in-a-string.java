class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        int left =0;
        List<Integer> list = new ArrayList<>();
        if(m > n){
            return list;
        }
        int window = m;
        int a[] = new int[26];
        int b[] = new int[26];
        for(char ch : p.toCharArray()){
            a[ch - 'a']++;
        }
       for(int i=0;i<window; i++){
            b[s.charAt(i) - 'a']++;
       }
      if (Arrays.equals(a,b)){
        list.add(0);
      }
       for(int i=window; i<n;i++){
        b[s.charAt(i) - 'a']++;
        left = i - window;
        char ch = s.charAt(left);
        b[ch - 'a']--;
        if(Arrays.equals(a,b)){
            list.add(left+1);
        }
       }
       return list;
    }
}