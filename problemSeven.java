class problemSeven {
  public static int largerAbsValVariation(int num1, int num2, int num3){
    return problemSix.largerAbsVal(problemSix.largerAbsVal(num1, num2), num3);
  }
}