class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0, ten = 0;
        for(int i=0;i<n; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                ten++;
                five--;
                if(five < 0){
                    return false;
                }
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else{
                    if(five < 3){
                        return false;
                    }
                    else{
                        five -= 3;
                    }
                }
            }
        }
        return true;
    }
}