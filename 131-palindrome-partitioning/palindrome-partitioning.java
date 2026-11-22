class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(ans,list,s);
        return ans;
    }
    public static void solve(List<List<String>> ans, List<String> list, String s){
        if(s.length() == 0){
            ans.add(new ArrayList<>(list));
            return ;
        }
      
        for(int j = 0; j<s.length(); j++){
            String str = s.substring(0,j+1);
            if(isPalin(str)){
                list.add(str);
                solve(ans,list,s.substring(j+1));
                list.remove(list.size() - 1);
            }
        }
    }
    public static boolean isPalin(String s){
        int start = 0, end = s.length() -1;
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}