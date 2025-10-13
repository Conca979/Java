// 13. Create a Java class Car and a Java tester class CarTester to implement the following Car class design:
// Car
// -manufacturer: String
// -model: String
// -production Expense: float
// -productionTime: int
// -wheelNumber: int
// +price(): float
// Apply the encapsulation concept in your classes.
// The price() method calculates the selling price of a car as follows:
// price = 2 productionExpense * sqrt(productionTime)
// The CarTester class should:
// o Create an array of 5 Car objects;
// Display the information of all Car objects and the corresponding selling prices in the created array to the standard output.

class CarTester {
  String manufacturer;
  String model;
  float productionExpense;
  int productionTime;
  int wheelNumber;
  //
  CarTester(String manufacturer, String model, float productionExpense, int productionTime, int wheelNumber) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.productionExpense = productionExpense;
    this.productionTime = productionTime;
    this.wheelNumber = wheelNumber;
  }
  //
  double price() {
    return 2*this.productionExpense*(Math.sqrt(this.productionTime));
  }
}

public class Main {
  public static void main(String[] args) {
    CarTester[] cars = new CarTester[5];
    cars[0] = new CarTester("Tesla", "Y9", 32000, 24, 1922);
    cars[1] = new CarTester("Volvo", "Wheel38", 24000, 18, 9922);
    cars[2] = new CarTester("mec", "ewfe", 93993, 123, 334);
    cars[3] = new CarTester("KJDnjnf", "djwjd", 324342, 123, 334);
    cars[4] = new CarTester("dnwdiwnd", "dwdwwdwadw", 10000, 23, 2344);
    for (int i = 0; i < 5; i++) {
      System.out.println(cars[i].price());
    }
  }
}