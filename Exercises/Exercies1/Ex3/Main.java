// 3. Write a program in Java that shows to the screen the following 21 lines:
// 10 exams, we take in one week, 
// Now one exam has the result,
// 9 exams, we take in one week,
// Now one exam has the result,
// ...
// 1 exam, we take in one week, 
// Now one exam has the result, 
// Thanks god, no exam this week.

public class Main {
  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      System.err.printf("%d exams, we take in one week,\nNow one exam has the result,\n", i);
    }
    System.err.println("Thanks god, no exam this week.");
  }
}
