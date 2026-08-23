public class ReverseVowels{
  
    public boolean isVowel(char ch){
      
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
  
    public String reverseVowels(String s) {

        char []arr = s.toCharArray();
        int left = 0;
        int right =arr.length-1;

        while(left<=right){
          
            if(!isVowel(arr[left])){
                left++;
            }
              
            else if(!isVowel(arr[right])){
                right--;
            }
              
            else{
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                   left++;
                   right--;               
            }
         
        }

        return String.valueOf(arr);        
    }
}
