class problemFive {
  public static void printGrid(int rows, int columns){
    for (int i = 1; i <= rows; i++){
      for (int j = 0 ; j < columns; j++){
        System.out.print(i+(j*4) + " ");
      }
      System.out.println();
    }
  }
}