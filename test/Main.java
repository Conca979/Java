import Q1.book;
import Q1.LibraryItem;
import Q1.DVD;

public class Main {
  public static void main(String[] args) {
    // book[] books = new book[3];
    // books[0] = new book("The bird", "D", "1234", 2001, "1a");
    // books[1] = new book("Waking", "T", "2222", 2000, "1a");
    // books[2] = new book("The revolution", "E", "3443", 2010, "1a");
    // for (int i = 0; i < books.length; i++) {
    //   System.out.println("book "+(i+1)+":");
    //   books[i].displayInfo();
    // }
    LibraryItem[] items = new LibraryItem[3];
    items[0] = new book("The bird", "D", "1234", 2001, "b1");
    // items[1] = new book("Waking", "T", "2222", 2000, "b2");
    // items[2] = new DVD(120, "Long run", "d1");
    // for (int i = 0; i < items.length; i++) {
    //   items[i].checkOut();
    // }
    items[0].borrow();
  }
}
