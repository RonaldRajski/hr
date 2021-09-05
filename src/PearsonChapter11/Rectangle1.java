package PearsonChapter11;


//Rectangle
//        -width: double
//        -height: double
//        +Rectangle()
//        +Rectangle(width: double, height: double)
//        +Rectangle(width: double, height: double color: String, filled: boolean)
//        +getWidth(): double
//        +setWidth(width: double): void
//        +getHeight(): double
//        +setHeight(height: double): void
//        +getArea(): double
//        +getPerimeter(): double

public class Rectangle1 extends GeometricObject1 {
//when you place extends you crreate a superclass
    private double width;
    private double height;


//    Constructors

    public Rectangle1(){

    }

    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle1(double width, double height, String color, boolean filled){
        this.width =  width;
        this.height= height;
        setColor(color);
        setFilled(filled);
    }

//    Getters and Setters


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width * height);
    }


}
