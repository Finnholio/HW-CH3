class problemTwo {
  public static void printPowersOf2(int num){
    for (int i = 0; i <= num; i++){
      int powerToPrint = 1;
      for (int j = 0; j < i; j++){
        powerToPrint *= 2;
      }
      System.out.print(powerToPrint + " ");
    }
    System.out.println();
  }
}