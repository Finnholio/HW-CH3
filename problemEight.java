import java.lang.Math;

class problemEight {
  public static void quadratic(float a, float b, float c){
    System.out.print("x = " + ((-b + Math.sqrt(b*b - 4*a*c))/2*a) + ", ");
    System.out.println("x = " + ((-b - Math.sqrt(b*b - 4*a*c))/2*a));
  }
}