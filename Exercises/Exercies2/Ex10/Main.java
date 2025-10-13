// 10. Write a Java class Cow and a Java tester class CowTester to implement the following Cow class design:
// Cow
// name: String
// breed: String
// age: int
// weight: double
// moo(): void
// Π Apply the encapsulation concept in your classes.
// The moo() method should display the text "Moo...".
// The CowTester class should:
// Make a Cow object;
// Set values of the Cow object attributes;
// Call the moo() method.

class Cow {
  String name;
  String breed;
  int age;
  double weight;
  //
  Cow(String n, String b, int a, double w) {
    this.name = n;
    this.breed = b;
    this.age = a;
    this.weight = w;
  }
  //
  void moo() {
    System.out.printf("The %fkg cow %s, bread %s, said %s in its age of %d", this.weight, this.name, this.breed, "Moo", this.age);
  }
}

public class Main {
  public static void main(String[] args) {
    Cow theCow = new Cow("Cow", "femle", 3, 34.12);
    theCow.moo();
  }
}