class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long a = dividend;
        long b = divisor;
        boolean negative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        long quotient = 0;
        while(a >= b) {
            long value = b;
            long multiple = 1;
            while( a >= value + value) {
                value += value;
                multiple += multiple;
            }
            a -= value;
            quotient += multiple;
        }
        if(negative) quotient = -quotient;
        return (int) quotient;
    }
}