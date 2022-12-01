package exersize3;

public class uchburchak {
    int katet1;

    int katet2;
    float gipotenuza;

    public uchburchak(int katet1, int katet2,float gipotenuza){
        this.katet1=katet1;
        this.katet2=katet2;
        this.gipotenuza=gipotenuza;
    }
    public void peri(){
        System.out.println("perimetr: "+katet1+katet2+gipotenuza);
    }
    public void yuza(){
        System.out.println("Yuza: "+(katet2+katet2)/2);
    }
}
