public class ShuffleArray{
  public int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        int index = 0;

        for(int i=0;i<n;i++){
            result[index++] = nums[i];
            result[index++]=nums[n+i];            
        }

        return result;       
    }
}
