public class MaximumAverageSubarrayI{
  public double findMaxAverage(int[] nums, int k){
    int sum = 0;
    
    for(int i=0;i<k;i++){
      sum+=nums[i];
    }
    int maxSum = sum;

    for(int j=1;j<=nums.length-k;j++){
      sum=sum-nums[j-1]+nums[i+k-1];
      maxSum =Math.Max(sum,MaxSum);
    }
    return (double)maxSum/k;
  }
}
