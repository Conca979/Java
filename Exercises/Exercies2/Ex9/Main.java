// 9. Write a Java class NameCard and a Java tester class NameCardTester to implement the following NameCard class design:
// NameCard
// name: String
// phone: int
// email: String
// print(): void
// Apply the encapsulation concept in your classes.
// The print() method should display information about a NameCard object.
// The NameCardTester class should:
// Make a NameCard object;
// Set values for the NameCard object attributes;
// o Call the print() method.

class NameCard {
  String name;
  int phone;
  String email;
  //
  NameCard(String n, int phone, String email) {
    this.name = n;
    this.phone = phone;
    this.email = email;
  }
  //
  void print() {
    System.err.printf("NameCard object: \n\tname: %s\n\tphone: %d\n\temail: %s", this.name, this.phone, this.email);
  }
}

public class Main {
  public static void main(String[] args) {
    NameCard myCard = new NameCard("D", 122345, "D@gmail.com");
    myCard.print();
  }
}