public class CheckArithmeticProgression{
  class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Difference must be divisible evenly
        if ((max - min) % (arr.length - 1) != 0) {
            return false;
        }

        int diff = (max - min) / (arr.length - 1);

        // If all elements are equal
        if (diff == 0) {
            return true;
        }

        boolean[] visited = new boolean[arr.length];

        for (int num : arr) {

            int index = (num - min) / diff;

            // Invalid position
            if ((num - min) % diff != 0) {
                return false;
            }

            // Duplicate position
            if (visited[index]) {
                return false;
            }

            visited[index] = true;
        }

        return true;
    }
}
}
