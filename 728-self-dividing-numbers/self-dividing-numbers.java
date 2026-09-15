class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            int num = i;
            boolean valid = true;
            while(num > 0) {
                int d = num % 10;
                num = num / 10;
                if(d == 0 || i % d != 0) {
                    valid = false;
                    break;
                }
            }
            if(valid) a.add(i);
        }
        return a;
    }
}