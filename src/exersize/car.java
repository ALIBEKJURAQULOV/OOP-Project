package exersize;

public class car {
    public String name;
    public String color;
    public String model;

    public car(){

    }
    public car(String name,String color,String model){
        this.name=name;
        this.color=color;
        this.model=model;
    }
    public void  start(){
        System.out.println(this.name+" "+this.color+" "+this.model);
    }

}