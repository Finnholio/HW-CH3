class problemThree {
  public static void printPowersOfN(int power, int num){
    for (int i = 0; i <= num; i++){
      int powerToPrint = 1;
      for (int j = 0; j < i; j++){
        powerToPrint *= power;
      }
      System.out.print(powerToPrint + " ");
    }
    System.out.println();
  }
}