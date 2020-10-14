import java.lang.Math;
class problemSix {
  public static int largerAbsVal(int num1, int num2){
    if (Math.abs(num1) > Math.abs(num2)){
      return Math.abs(num1);
    }
    else {
      return Math.abs(num2);
    }
  }
}