// 5. What do the following commands give? Explain the reason.
// int weight;
// boolean b = 60 <= weight <= 90;
// System.out.println(b);

public class Main {
  public static void main(String[] args) {
    int weight;
    boolean b = 60 <= weight <= 90;
    System.err.println(b); // uninitializing error
  }
}
