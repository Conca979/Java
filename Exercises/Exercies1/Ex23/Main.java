// 23. Write a program in Java that computes min the max of three real numbers obtained from command-line arguments.

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
      // System.out.println(nums[i]);
    }
    // sortting
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = 0; j < nums.length-1-i; j++) {
        if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
    //
    if (args.length > 0) {
      int min = nums[args.length-1];
      for (int i = args.length-1, count = 3; i >= 0 && count > 0; i--, count--) {
        System.out.println(nums[i]);
        if (nums[i] < min)
          min = nums[i];
      }
      System.out.println(min);
    } else {
      System.out.println("Empty input");
    }
  }
}