package platform2;

import java.util.Arrays;

public class Student {
    public String familya;
    public String ism;
    public int guruhnumer;

    public String fan1;
    public String fan2;
    public String fan3;
    public String fan4;
    public String fan5;
 public  String[] fanlar1;

    public Student(String familya, String ism, int guruhnumber ,String[] fanlar){
       this.familya=familya;
       this.ism=ism;
       this.guruhnumer=guruhnumer;
       this.fanlar1=fanlar;
    }
    public void printSubjects(){
        System.out.println(this.familya+""+this.ism+""+this.guruhnumer+this.fanlar1);
    }

}
