public class PerfectSquares{
    public int numSquares(int n) {
        // Case 1: If n itself is a perfect square
        if (isSquare(n)) {
            return 1;
        }
        
        // Case 2: Check Legendre's Three-Square Theorem: 4^k * (8m + 7) -> 4 squares
        int temp = n;
        while (temp % 4 == 0) {
            temp /= 4;
        }
        if (temp % 8 == 7) {
            return 4;
        }
        
        // Case 3: Check if the number can be formed by the sum of 2 squares
        for (int i = 1; i * i <= n; i++) {
            int remainder = n - (i * i);
            if (isSquare(remainder)) {
                return 2;
            }
        }
        
        // Case 4: By elimination, any other number requires 3 squares
        return 3;
    }
    
    // Helper method to check if a number is an exact integer square
    private boolean isSquare(int x) {
        if (x < 0) return false;
        int root = (int) Math.sqrt(x);
        return root * root == x;
    }
}
