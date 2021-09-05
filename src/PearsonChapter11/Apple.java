package PearsonChapter11;

public class Apple extends Fruit{
    public Apple(String name) {
        super(name);
    }
}
class Fruit{
        public Fruit(String name){
            System.out.println("Fruit's Constructor is invoked");

    }
}
