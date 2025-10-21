// 9. Create an array of polymorphic objects in Java to show that objects of child classes can be treated as if they are objects of the parent class.

class Animals {
  void makeNoise() {
    System.out.println("The animal making noise");
  }
}

class Dog extends Animals {
  void makeNoise() {
    System.out.println("The dog barks");
  }
}

class Cat extends Animals {
  void makeNoise() {
    System.out.println("The cat said meoww");
  }
}
public class Main {
  public static void main(String[] args) {
    Animals[] animals = new Animals[3];
    animals[0] = new Cat();
    animals[1] = new Dog();
    animals[2] = new Animals();
    //
    for (int i = 0; i < 3; i++) {
      animals[i].makeNoise();
    }
  }
}