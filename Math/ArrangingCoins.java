public class ArrangingCoins {
    public int arrangeCoins(int n) {
         long x = 8L * n + 1;                    // use long to avoid overflow
        long r = (long) Math.sqrt((double) x);  // approximate integer sqrt

        // Correct any rounding error from the double sqrt
        while ((r + 1) * (r + 1) <= x) r++;
        while (r * r > x) r--;

        return (int) ((r - 1) / 2);
    
        
    }
}
