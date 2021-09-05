package PearsonChapter11;


//-color: String
//        -filled: boolean
//        -dateCreated: java.util.Date
//        +GeometricObject()
//        +GeometricObject(color: String, filled: boolean)
//        +getColor(): String
//        +setColor(color: String): void
//        +isFilled(): boolean
//        +setFilled(filled: boolean): void
//        +getDateCreated(): java.util.Date
//        +toString(): String

public class GeometricObject1 {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


//default constructor
    public GeometricObject1(){
        dateCreated = new java.util.Date();

    }

    public GeometricObject1(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

//    Getters and Setters

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor " + color + " and filled: " + filled;
    }





}
