class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        for (int i = n; i > 0; i = i / 10) {
            sum += i % 10;
            prod *= i % 10;
        }
        return n % (sum + prod) == 0;
    }
}