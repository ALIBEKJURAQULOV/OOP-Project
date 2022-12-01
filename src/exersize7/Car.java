package exersize7;

public class Car {
    String model;
    String color;
    String number;
    int year;
    int maxspeed;


    double kmg;
    boolean state;


    //Constructor
    //default constractor
//    Car(){
//
//    }

    //No-arg constructor
    Car(){
        year=2020;
        maxspeed=220;
        kmg=100;
    }

    //Parametrized constructor
    Car(String model,String color,String number,int year,int maxspeed,double kmg,boolean state){
      this.model=model;
        this.color=color;
        this.number=number;
        this.year=year;
        this.maxspeed=maxspeed;
        this.kmg=kmg;
        this.state=state;
    }

    void starton() {
        state = true;
        System.out.println("moshina ut oldi");
    }

    void startof() {
        state = false;
        System.out.println("moshina uchdi");
    }

    void drive(double distance) {
        kmg += distance;
        System.out.println("Moshina " + distance + "masofani bosib utdi");

    }


}
