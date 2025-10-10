// 10. What do the following commands give? Explain the reason.
// for (;;) {
// System.out.println("Welcome to OOP course");
// }

public class Main {
  public static void main(String[] args) {
    for (;;) {
      System.err.println("Welcome to OOP course"); 
      // no termination operator, loop run "Welcome to OOP course"
    }
  }
}