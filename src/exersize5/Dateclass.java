package exersize5;

public class Dateclass {
    int yil;
    int oy;
    int kun;

    public Dateclass(int kun,int oy,int yil){
        this.kun=kun;
        this.oy=oy;
        this.yil=yil;
    }
    public void all(){
        System.out.println(kun+"."+oy+"."+yil);
    }

}
