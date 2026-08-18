class Solution {
    public int fib(int n) {
        int num1 = 0, num2 = 1, temp = 0;
        if (n <= 1)
            return n;

        for (int i = 2; i <= n; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
}