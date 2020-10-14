import java.lang.*;
class problemEleven {
  public static String padString(String text, int length){
    String outputText = text;
    if (length - text.length() > 0){
      for (int i = 0; i < length - text.length(); i++){
        outputText += " ";
      }
    }
    return outputText;
  }
}