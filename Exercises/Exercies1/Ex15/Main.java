// 15. What do the following commands give? Explain the reason.
// int[] t = {21, 33, 45, 57, 69} ;
// int[] k = {21, 33, 45, 57, 69} ;
// System.out.println ( t ==k) ;

public class Main {
  public static void main(String[] args) {
    int[] t = {21, 33, 45, 57, 69};
    int[] k = {21, 33, 45, 57, 69};
    System.err.println(t == k); //  false, reference comparing
  }
}