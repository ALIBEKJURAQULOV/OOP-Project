package exersize8;

public class Car {
    String serialnumber;
    String name;
    String color;
    int speed;
    double price;

    public Car(String serialnumber, String name, String color, int speed, double price) {
        this.serialnumber = serialnumber;
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialnumber='" + serialnumber + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
