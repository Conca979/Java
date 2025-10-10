// 17. Write a program in Java to solve the linear equation:
// ax + b = 0
// where the coefficients a and b are real numbers obtained from the command-line arguments. The program should print the root/roots of the linear equation to the standard output.

public class Main {
  public static void main(String[] args) {
    float a = Float.parseFloat(args[0]);
    float b = Float.parseFloat(args[1]);
    System.err.println("x = "+(0-b)/a);
  }
}