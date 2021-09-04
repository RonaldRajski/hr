package PearsonChapter11;

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
}
