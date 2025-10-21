package Q1;

public abstract class LibraryItem {
  public String id; // unique id of each item
  public String title;
  public boolean isBorrowed;
  //
  LibraryItem (String i, String t) {
    this.id = i;
    this.title = t;
    this.isBorrowed = false;
  }
  //
  public abstract void checkOut();
  public abstract void borrow();
  public abstract void returnItem();
}
