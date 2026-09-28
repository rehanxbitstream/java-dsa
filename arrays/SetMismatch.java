public class SetMismatch{
  public int[] findErrorNums(int[] nums) {
       
        int missing = 0;
        int duplicate = 0;
        

        int [] freq = new int[nums.length+1];
        for(int i:nums){
            freq[i]++;
        }

        for(int i=1;i<=nums.length;i++){
            if (freq[i]==2){
                duplicate =i;
                
            }
           else if(freq[i]==0){
            missing = i;
                
            }
        }
        return new int[]{duplicate,missing};
        
    }
}
