package exersize2;

public class point {
    int kordinataX;
    int kordinataY;
    public point(int kordinataX,int kordinataY ){
        this.kordinataX=kordinataX;
        this.kordinataY=kordinataY;
    }
    public void printxy(){
        System.out.println("("+this.kordinataX+", "+this.kordinataY+")");
    }

}
