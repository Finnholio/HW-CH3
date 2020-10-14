import java.util.Scanner;
class problemFifteen {
  public static void processName(){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Please enter your full name: ");
    String name = sc.nextLine();
    String firstName = name.split(" ", -2)[0];
    String lastName = name.split(" ", -2)[1];

    System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
  }
}