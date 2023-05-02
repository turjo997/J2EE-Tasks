package JavaExam;

import Task.B;
import Task.D;

class Vehicle{
  public void printSound(){
      System.out.println("vehicle");
  }
}

class Car extends Vehicle{
    public void printSound(){
        System.out.println("car");
    }


}

class Bike extends Vehicle{
    public void printSound(){
        System.out.println("bike");
    }

}


class Parent{
    String msg = "parent";
    void say(){
        System.out.println(msg);
    }
}

class Child extends Parent{
    String msg = "child";
}


interface A{}
interface B1 extends A{}
class C implements B1{}



public class Exam111 extends C {

    public static void main(String[] args) {
//         Vehicle v = new Car();
//         Bike b = (Bike) v;
//
//         v.printSound();
//         b.printSound();

       // new Child().say();

        C c = new C();
     //   A a  = (Exam111) c;
      //  A a = c;

        B1 b = c;
    }
}
