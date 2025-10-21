// 10. Present the concept of abstraction in object-oriented programming. How can we obtain abstraction in Java?

abstract class Animals {
  String sex;
  //
  Animals(String s) {
    this.sex = s;
  }
  abstract void makeNoise();
}

class Cat extends Animals {
  Cat(String s) {
    super(s);
  }
  void makeNoise() {
    System.out.println("The "+sex+" cat meows");
  }
}

public class Main {
  public static void main(String[] args) {
    Cat car = new Cat("female");
    car.makeNoise();
  }
}