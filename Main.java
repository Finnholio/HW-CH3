class Main {
  public static void main(String[] args) {
    //problem one
    problemOne.printNumbers(5);
    problemOne.printNumbers(15);

    System.out.println("\n");
    //problem two
    problemTwo.printPowersOf2(3);
    problemTwo.printPowersOf2(10);

    System.out.println("\n");
    //problem three
    problemThree.printPowersOfN(3,4);
    problemThree.printPowersOfN(5,6);
    problemThree.printPowersOfN(-2,8);

    System.out.println("\n");
    //problem four
    problemFour.printSquare(3, 7);

    System.out.println("\n");
    //problem five
    problemFive.printGrid(4, 6);

    System.out.println("\n");
    //problem six
    System.out.println(problemSix.largerAbsVal(11, 2));
    System.out.println(problemSix.largerAbsVal(4, -5));

    System.out.println("\n");
    //problem seven
    System.out.println(problemSeven.largerAbsValVariation(7, -2, -11));
    System.out.println(problemSeven.largerAbsValVariation(4, 5, 2));

    System.out.println("\n");
    //problem eight
    problemEight.quadratic(1, -7, 12);

    System.out.println("\n");
    //problem nine
    System.out.println(problemNine.distance(1, 0, 4, 4));
    //in the textbook they get a different anwser for problem below
    //an online distance calculator says my anwser is correct though  
    System.out.println(problemNine.distance(10, 2, 3, 5));

    System.out.println("\n");
    //problem ten
    System.out.println(problemTen.scientific(6.23, 5));
    System.out.println(problemTen.scientific(1.9, -2));

    System.out.println("\n");
    //problem eleven
    System.out.println(problemEleven.padString("hello", 8));
    System.out.println(problemEleven.padString("congratulations", 10));

    System.out.println("\n");
    //problem twelve
    problemTwelve.vertical("hey now");
    System.out.println("Your a rock star");

    System.out.println("\n");
    //problem thirteen
    System.out.println(problemThirteen.printReverse("hello there!"));

    System.out.println("\n");
    //problem fourteen
    problemFourteen.inputBirthday();

    System.out.println("\n");
    //problem fifteen
    problemFifteen.processName();
  }
}