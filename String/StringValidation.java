public class StringValidation{
  public static boolean isValid(String text){
    for(int i=0;i<text.length();i++){
      char ch = text.charAt(i);

      if(!Character.isLowerCase(ch)){
        return false;
      }

      if(i>0 && ch==text.charAt(i-1)){
        return false;
      }
    }
    
    return true;    
  }
}
