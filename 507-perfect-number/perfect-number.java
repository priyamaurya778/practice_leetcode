class Solution {
    public boolean checkPerfectNumber(int num) {
        int dup = num;
        int sum = 1;
        if(num <= 1) return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
               sum += i;
            }
        }
        if(dup == sum) return true;
        else return false;
    }
}