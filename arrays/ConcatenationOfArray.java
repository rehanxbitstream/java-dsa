public class ConcatenationOfArray{
  public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = (nums.length*2)-1;
        int n1 = nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[n-i]=nums[n1-i];
        }

        return ans;   
        
    }
}
