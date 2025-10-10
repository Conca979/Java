// 19. Write a program in Java that gets an integer n (n > 1) from a command-line argument and prints a random integer number between n/2 and n to the standard output.

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int num;
    do {
      num = random.nextInt(Integer.parseInt(args[0]));
    } while (num <= Integer.parseInt(args[0])/2);
    System.out.println(num);
    
  }
}