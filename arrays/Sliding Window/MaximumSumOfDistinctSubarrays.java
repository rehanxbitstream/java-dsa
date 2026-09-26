public class MaximumSumOfDistinctSubarrays{
  public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        long sum = 0;
        long maxSum = 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int j=0;j<nums.length;j++){

            while(hs.contains(nums[j])){
                hs.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                
            }
            hs.add(nums[j]);
            sum+=nums[j];

            if(j-i+1 == k){
                maxSum = Math.max(maxSum,sum);

                hs.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }    
        return maxSum;        
    }
}
