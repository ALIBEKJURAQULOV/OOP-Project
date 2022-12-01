package exersize8;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("01 0001A1", "maluba", "black", 220, 13000);
        Car car2 = new Car("01 A0001A1", "gtelik", "red", 220, 12000);
        Car car3 = new Car("01 A0001A1", "nexia", "grey", 220, 11000);
        Car car4 = new Car("01 A001A1", "trekker", "bluek", 220, 15000);
        Car car5 = new Car("01 A000A1", "cobalt", "oq", 220, 18000);

        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].getColor().equals("red")) {
                System.out.println(cars[i]);
            }
        }
        System.out.println();
        System.out.println();
        princolors(cars, "red");

       Car[] qaytar=  printcarslist(cars, 12000);



    }
    public static void princolors(Car[] cars,String colors){
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].getColor().equals(colors)){
                System.out.println(cars[i]);
            }
        }
    }
    public static Car[] printcarslist(Car[] cars, double price){
       Car[] newcars=new Car[cars.length];
         for (int i = 0; i < cars.length ; i++) {
            if (cars[i].getPrice()>price){
                newcars[i]=cars[i];
            }
        }
        return newcars;
    }
}
