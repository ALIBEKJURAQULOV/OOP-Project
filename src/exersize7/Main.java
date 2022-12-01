package exersize7;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
//        car1.kmg=100;
//        car1.state=false;
        car1.color="black";
        car1.model="trekker";
//        car1.maxspeed=220;
        car1.number="01 A777AA";
//        car1.year=2002;


        Car car2=new Car();
//        car2.year=2220;
        car2.number="01 A770AA";
//        car2.maxspeed=220;
        car2.model="Molibu";
        car2.color="oq";
//        car2.kmg=1220;
        car2.state=true;

        System.out.println("=======car1=====");
        System.out.println("model:"+car1.model);
        System.out.println("year:"+car1.year);
        System.out.println("Color;"+car1.color);
        System.out.println("number;"+car1.model);
        System.out.println("state;"+car1.state);
        System.out.println("kmg:"+car1.kmg);
        System.out.println("maxspeed"+car1.maxspeed);


        System.out.println("=======car2=====");
        System.out.println("model:"+car2.model);
        System.out.println("year:"+car2.year);
        System.out.println("Color;"+car2.color);
        System.out.println("number;"+car2.model);
        System.out.println("state;"+car2.state);
        System.out.println("kmg"+car2.kmg);
        System.out.println("maxsped"+car2.maxspeed);

        System.out.println("Objectlarni metodlarni ishlatish");
        System.out.println("=======car1=====");
        System.out.println("model:"+car1.model);
        car1.startof();
        System.out.println("year:"+car1.year);
        System.out.println("Color;"+car1.color);
        System.out.println("number;"+car1.model);
        System.out.println("state;"+car1.state);
        System.out.println("maxspeed"+car1.maxspeed);
        System.out.println("kmg"+car2.kmg);

        System.out.println("=======car2=====");
        car2.starton();
        System.out.println("model:"+car2.model);
        System.out.println("year:"+car2.year);
        System.out.println("Color:"+car2.color);
        System.out.println("number:"+car2.model);
        System.out.println("state:"+car2.state);
        System.out.println("maxspeed"+car1.maxspeed);
        System.out.println("kmg"+car2.kmg);

        //Constructor
        Car car3= new Car("Captiva","Oq","01 A770AA",2012,12000,1200,true);

        System.out.println("=======car3=====");
        car2.starton();
        System.out.println("model:"+car3.model);
        System.out.println("year:"+car3.year);
        System.out.println("Color:"+car3.color);
        System.out.println("number:"+car3.number);
        System.out.println("state:"+car3.state);
        System.out.println("maxspeed"+car3.maxspeed);
        System.out.println("kmg"+car3.kmg);

        Car car4 =new Car("lacceti","oq","01 A888AA",2016,220,50000,false);
        System.out.println(car4.kmg);
        System.out.println("=======car4 ning drive methodi chaqirildi========");
        car4.drive(1234);
        System.out.println(car4.kmg );


    }
}
