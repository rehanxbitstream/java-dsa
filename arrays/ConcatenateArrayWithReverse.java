public class ConcatenateArrayWithReverse{
    public int[] concatWithReverse(int[] nums) {

        int[] result = new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
            result[result.length-1-i]=nums[i];
        }

        return result;
        
    }
}
