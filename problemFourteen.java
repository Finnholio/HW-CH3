import java.util.Scanner;

class problemFourteen {
  public static void inputBirthday(){
    Scanner sc = new Scanner(System.in); 
    System.out.print("On what day of the month were you born? ");
    String day = sc.nextLine();
    System.out.print("What is the name of the month in which you were born? ");
    String month = sc.nextLine();
    System.out.print("During what year were you born? ");
    String year = sc.nextLine();

    System.out.println("You were born on " + month + " " + day + ", " + year + ". You’re mighty old!");
  }
}