public class PerfectNumber{
  public boolean checkPerfectNumber(int num) {
  
        // 1 is not a perfect number
        if (num == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                // n is a perfect square
                // let's take 25
                // we need to add 5 only once
                // sum += i + n / i will add it twice

                if (i * i == num)
                    sum += i;
                else
                    sum += i + (num / i);
            }
        }
        

        return sum==num;
        
    }
  
}
