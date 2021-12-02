/*
 * This program reads the width and height from the user, and returns the 
   length of the board foot knowing that the board foot always has a volume
   of 144 inches^3.	 
 *
 *
 * By Zefeng Wang
 * Created on December 2, 2021
 * */

// import Scanner class
import java.util.Scanner;

// class BoardFoot.
class BoardFoot {
  // Continues to ask the user for valid inputs, and uses those inputs to calculate the length
  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    double width = 0;
    double height = 0;
    double length = 0;
    while (true) {
      try {
        System.out.println("Please enter the width: ");
        width = Double.parseDouble(scannerObj.next());
        System.out.println("Please enter the height: ");
        height = Double.parseDouble(scannerObj.next());
        length = calculateBoardFoot(width, height);
        break;
      } catch (Exception e) {
        System.out.println("Please enter a number.");
      }
    }
    System.out.printf("Length is %s inch(es),height is %s inch(es), and width is %s inch(es)\n", 
                     length, height, width);
  }

  // Calculates the length given the width and height
  public static double calculateBoardFoot(double width, double height) {
    final int boardFootVol = 144;
    return boardFootVol / (width * height);
  }
}
