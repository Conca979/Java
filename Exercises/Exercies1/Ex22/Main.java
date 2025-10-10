// 22. Write a program in Java that converts an integer number n (n > 1) into its binary representation. The number n is obtained from a command-line argument.

public class Main {
  public static void main(String[] args) {
    String binary = "";
    int num = Integer.parseInt(args[0]);
    while (num > 0) {
      binary = num%2 + binary;
      num /= 2;
    }
    System.out.println(binary);
  }
}