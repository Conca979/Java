// 11. Write a Java class Vector and a Java tester class VectorTester to implement the following Vector class design:
// Vector
// x: double
// y: double
// add(Vector v): Vector
// subtract(Vector v): Vector
// multiply(Vector v): Vector
// Apply the encapsulation concept in your classes.
// The add(), subtract(), and multiply() methods return the addition, subtraction, and multiplication of two vectors, respectively.
// The VectorTester class should:
// Make a Vector object;
// Set values for the Vector object attributes;
// Call the add(), subtract() and multiply() methods.

class vector {
  double x;
  double y;
  //
  vector(double x, double y) {
    this.x = x;
    this.y = y;
  }
  //
  vector addition(vector a) {
    return new vector(this.x + a.x, this.y + a.y);
  }
  vector subtraction(vector a) {
    return new vector(this.x-a.x, this.y-a.y);
  }
  vector mul(vector a) {
    return new vector(this.x*a.x, this.y*a.y);
  }
}

public class Main {
  public static void main(String[] args) {
    vector A = new vector(1, 2);
    vector B = new vector(3, 4);
    System.out.printf("[(%f, %f),(%f, %f),(%f, %f)]", A.addition(B).x, A.addition(B).y, A.subtraction(B).x, A.subtraction(B).y, A.mul(B).x, A.mul(B).y);
  }
}