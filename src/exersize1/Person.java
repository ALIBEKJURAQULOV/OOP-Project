package exersize1;

public class Person {
    public String name;
    public String surname;
    public int  age;
    public String adress;

    public Person(String name,String surname,int age,String adress){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.adress=adress;
    }
    public void start(){
        System.out.println(this.name+" "+this.surname+" "+this.age+" "+this.adress);
    }

}
