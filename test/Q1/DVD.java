package Q1;
//
import Q1.LibraryItem;

public class DVD extends LibraryItem {
  public int durationInMinute;
  //
  public DVD (int duration, String tile, String id) {
    super(tile, id);
    this.durationInMinute = duration;
  }
  // 
  public void checkOut() {
    checkOut = true;
    System.out.println("DVD "+this.title+" has been checked out. Due back in 1 week.");
  }
}
