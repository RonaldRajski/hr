package PearsonChapter11;

//Circle
//        -radius: double
//        +Circle()
//        +Circle(radius: double)
//        +Circle(radius: double, color: String, filled: boolean)
//        +getRadius(): double
//        +setRadius(radius: double): void
//        +getArea(): double
//        +getPerimeter(): double
//        +getDiameter(): double
//        +printCircle(): void

import Pearson.Chapter9.Circle;

public class Circle4 extends GeometricObject1{
    private double radius;

    public Circle4(double radius){
        super();
        this.radius = radius;
    }

    public Circle4(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println(toString() + "The circle is created " + getDateCreated()  +
                " and the radius is " + radius);
        System.out.println("The circle is created " + super.getDateCreated() + "and the radius is " + radius);
    }
    public String toString(){
        return "Circle WWW " + getColor() + super.toString();
    }
}
