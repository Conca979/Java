// 16. Write a program in Java that gets three integer numbers from command-line arguments, then prints a false value if the three numbers are equal or a true value otherwise.

public class Main {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    if (args.length == 3) {
      if (num1 == num2 && num2 == num3) {
        System.out.println("True");
      } else {
        System.out.println("False");
      }
    } else {
      System.out.println("Invalid arguments");
    }
  }
}