class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int temp_prev = prev;
            prev = curr;
            curr = curr + temp_prev;
        }

        return curr;
    }
}
