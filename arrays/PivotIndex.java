public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int []left = new int[nums.length];
        int []right = new int[nums.length];
        int rightSum = 0;
        int leftSum = 0;

        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            left[i]=leftSum;
        }

        for(int i = nums.length-1;i>=0;i--){
            rightSum+=nums[i];
            right[i]=rightSum;
        }

        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }

        return -1;
        
    }
}
