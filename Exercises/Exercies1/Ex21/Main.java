// 21. Write a program in Java that computes the sum of squares of integer numbers from 1 to n. The number n > 1 is obtained from a command-line argument.

public class Main {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int sum = 1;
    while (num > 1) {
      sum += Math.pow(num, 2);
      num--;
    }
    System.out.println(sum);
  }
}