public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int[] arr = new int[127];
        
        while(r<s.length()){
            int index = (int)s.charAt(r);
            arr[index] = arr[index]+1;
           
            while(arr[index]>1){
                int characterIndex = (int)s.charAt(l);
                arr[characterIndex] = arr[characterIndex]-1;
                l++;
            }
           
             int currentWindowLength = r-l+1;
             maxLength = Math.max(maxLength,currentWindowLength);
             r++;

        }
        return maxLength;
        
    }
}
