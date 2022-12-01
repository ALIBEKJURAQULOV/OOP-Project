package exersize4;

public class Myclass {
    int firstAtribut;
    int secondAttribut;

    public Myclass(int firstAtribut, int secondAttribut, int i){
        this.firstAtribut=firstAtribut;
        this.secondAttribut=secondAttribut;
    }
    public void aboutAttributes(){
        System.out.println("atributlari: "+firstAtribut+","+secondAttribut);
    }
    public void sumAttributes(){
        System.out.println("yig`indi: "+(firstAtribut+secondAttribut));
    }
    public void  maxAttribute (){
        if(firstAtribut>secondAttribut){
            System.out.println("kattasi:"+firstAtribut);
        }else {
            System.out.println("kattasi"+secondAttribut);
        }
    }


}

