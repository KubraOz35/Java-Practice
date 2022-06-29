


package day12constructorsmethodoverloading;
public class Car {
    /*
         1) Constructors are used to create objects from a class
         2) Java puts default constructors inside every class
         3)Default constructors does not have any parameter inside the constructor paranthesis
         (Default constructors are invisible)
         4) Constructor names must match with class name
         5)In a class we can have multiple constructors

         HOw to create a constructor?

         1) Type access modifier
         2) Type the class name as constructor name
         3) open-close paranthesis
         4) open-close curly brace

          Common Interview Question
         What are the differences between "constructors" and "methods?
         1)Constructors do not have any return type but methods have
         2)Constructor name should be the same with class name, but method names can be given by developer.


     */


    String make;
    String model;
    double price;
    int year;
    //That constructor is the same with default constructor, it is very simple,it doesnt have any perimeter


    //If we create any constructor in the class,java removes invisible one
    public Car(){//default simple constructor
    }

    public Car(String make, String model, double price, int year){//parameterize(advanced) constructor//mostly we will use this

        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    public static void main(String[] args) {

        Car         c1           =           new          Car();
        //Class     obj name              keyword       Constructor
        c1.make="Honda";
        c1.model="Civic";
        c1.price=10000;
        c1.year= 2016;


        Car  c2  =  new Car();//c1 and c2 created by default constructor
        c2.make = "Mercedes";
        c2.model = "AMG";//c3,c4,c5 created by parameterlize constructor
        c2.price = 30000;
        c2.year = 2020;

        Car c3 = new Car("BMW","M3",70000,2021);

        Car c4 = new Car("Volvo", "v60",10000,2000);
        Car c5 = new Car("toyota", "corolla", 5000 ,2020 );
        Car c6= new Car("Kia","Sedona",20000,2021);


    }
}



