package ClassObjectExercises;

public class Rectangle {
    private double width ;
    private double hight;

    public Rectangle() {
        this(1.0,1.0);
    }


    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }
    public double getArea(){
        return this.width*this.hight;
    }
    public double getPerimeter(){
        return this.hight*2+this.width*2;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
