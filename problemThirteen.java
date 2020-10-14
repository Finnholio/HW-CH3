class problemThirteen {
  public static String printReverse(String text){
    String reversedText = "";
    for (int i = text.length()-1; i >= 0; i--){
      reversedText+=text.charAt(i);
    }
    return reversedText;
  } 
}