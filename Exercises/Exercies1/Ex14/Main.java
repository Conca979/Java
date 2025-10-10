// 14. Write a program in Java that gets a mark as an integer number between 0 and 20 from a command-line argument and classifies the level of the mark based on the following table:
// Level Mark
// A     18-20
// B     16-17
// C     13-15
// D     12-14
// E     10-11
// F     <10
public class Main {
  public static void main(String[] args) {
    int mark = Integer.parseInt(args[0]);
    if (mark >= 18 && mark <= 20) {
      System.out.println("Level: A");
    } else if (mark >= 16 && mark <= 17) {
      System.out.println("Level: B");
    } else if (mark >= 13 && mark <= 15) {
      System.out.println("Level: C");
    } else if (mark >= 12 && mark <= 14) {
      System.out.println("Level: D");
    } else if (mark >= 10 && mark <= 11) {
      System.out.println("Level: E");
    } else if (mark < 10) {
      System.out.println("Level: F");
    } else {
      System.out.println("Invalid mark. Please enter a number between 0 and 20.");
    }
  }
}