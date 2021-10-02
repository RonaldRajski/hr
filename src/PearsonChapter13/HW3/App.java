package PearsonChapter13.HW3;

/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3:Vehicles
 * Date: September 19, 2021
 ********************************************/

public class App {
    public static void main(String[] args) {


    Truck truck = new Truck(1, "Ford", 4, "roads", new StarterType("key"));
        truck.start();
        truck.goStraight();
        truck.turnRight();
        truck.turnLeft();
        truck.stop();
        System.out.println("");


    Boat boat = new Boat(3, "SpeedBoat", 5, "ocean", new StarterType("ignition system"));
        boat.start();
        boat.goStraight();
        boat.turnPort();
        boat.turnStarboard();
        boat.turnAft();
        boat.stop();
        System.out.println("");


    Plane plane = new Plane(4, "707", 200, "sky", new StarterType("on switch"));
        plane.start();
        plane.goStraight();
        plane.up();
        plane.turnRight();
        plane.turnLeft();
        plane.down();
        plane.stop();
        System.out.println("");

        System.out.println(boat.isFaster(plane, boat));
        System.out.println(truck.isFaster(boat, truck));
        System.out.println(plane.isFaster(plane, truck));
        System.out.println(truck.isLarger(plane, boat));
        System.out.println(boat.isLarger(plane, truck));
        System.out.println(plane.isLarger(boat, truck));

}

}
