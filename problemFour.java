class problemFour {
  public static void printSquare(int min, int max){
    for (int i = 0; i <= max-min; i++){
      for (int j = min+i; j <= max; j++){
        System.out.print(j);
      }
      for (int j = min; j < min+i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}