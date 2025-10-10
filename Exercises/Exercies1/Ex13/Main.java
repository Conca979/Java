// 13. What do the following commands give? Explain the reason.
// boolean t = false;
// while (t = false) {
// System.out.println("OOP course");
// }

public class Main {
  public static void main(String[] args) {
    boolean t = false;
    while (t = false) {
      System.err.println("OOP course");
    }
    // wont do anything
  }
}