public class StringPermutation{
  public static boolean checkFrequency(int[]count1,int[] count2){
    for(int i=0;i<26;i++){
      if(count1[i]!=count2[i]){
        return false;
      }
    }
    return true;
  }


  public boolean checkInclusion(String s1,String s2){

    if(s1.length()>s2.length()){
      return false;
    }
    int [] count1 = new int[26];
    
    for(int i=0;i<s1.length();i++){
     char ch =  s1.charAt(i);
     int index = ch-'a';
      count1[index]++;
    }
    int windowSize = s1.length();
    int []count2 = new int[26];

    for(int i=0;i<windowSize;i++){
      char ch = s2.charAt(i);
      int index = ch-'a';
      count2[index]++;
    }
    
    if(checkFrequency(count1,count2)){
      return true;
    }
    else{
      for(int i = windowSize;i<s2.length();i++){
        count2[s2.charAt(i)-'a'];
        count2[s2.charAt(i-windowSize)-'a']--;
        if(checkFrequency(count1,count2)){
         return true;
         }
        
      }
      
    }
  return false;
  }
  
}
