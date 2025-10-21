package Q1;
//
import Q1.LibraryItem;

public class book extends LibraryItem {
  public String author;
  public String isbn;
  public int yearBulished;
    //
  public book (String t, String a, String i, int y, String id) {
    super(id, t);
    this.author = a;
    this.isbn = i;
    this.yearBulished = y;
  }
  //
  public void checkOut() {
    this.checkOut = true;
    System.out.println("book "+this.title+" has been checked out. Due back in 3 weeks.");
  }
  public abstract void borrow() throws ItemUnavailableException {
    if (this.isBorrowed == true) {
      throw new ItemUnavailableException();
    } else {
      this.isBorrowed = true;
      System.out.println("Borrowing the book "+this.title);
    }
  };
  public abstract void returnItem() throws ItemAvailableException {
    if (this.isBorrowed == false) {
      throw new ItemAvailableException();
    } else {
      this.isBorrowed = false;
      System.out.println("Returned the book "+this.title);
    }
  };
  public String getTitle() {
    return this.title;
  }
  public String getAuthor() {
    return this.author;
  }
  public void displayInfo() {
    System.out.println("\tTitle: "+this.title);
    System.out.println("\tAuthor: "+this.author);
    System.out.println("\tISBN: "+this.isbn);
    System.out.println("\tBublish year: "+this.yearBulished);
  }
}
