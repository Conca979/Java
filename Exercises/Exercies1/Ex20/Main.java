// 20. Write a program in Java to convert a Celsius degree to a Fahrenheit degree. The input is taken from a command-line argument.
// °F = (°C × 9/5) + 32

public class Main {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    System.err.printf("%d C = %d F", num, (num*9/5)+32);
  }
}