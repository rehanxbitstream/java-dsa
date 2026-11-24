public class LongestPalindrome{
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        boolean hasOdd = false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if(freq%2==0){
                count+=freq;
            }
            else{
                count +=freq-1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
        count++;
        }
        return count;
    }
}
