package platform1;

public class Date {
    public int  kun;
    public int  oy;
    public int  yil;

    public Date(int  kun,int  oy,int  yil){
        this.kun=kun;
        this.oy=oy;
        this.yil=yil;
    }

    public void returndate(){
    if(this.kun<=31&&this.oy<=12){
        System.out.println(this.kun+":"+this.oy+":"+this.yil);
    } else {
        System.out.println("ERROR");
    }
    }
}
