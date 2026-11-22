public class ReverseStringPrefix{
      public String reversePrefix(String s, int k) {
        if (s == null || s.length() <= 1 || k <= 1) {
            return s;
        }
         k = Math.min(k, s.length());
       
        char[] arr = s.toCharArray();

        int i = 0;
        int j = k-1;
        
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
