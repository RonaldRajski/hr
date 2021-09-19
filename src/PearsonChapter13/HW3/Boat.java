package PearsonChapter13.HW3;

/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3 Vehicles
 * Date: 9-17-21
 ********************************************/

public class Boat extends Vehicle implements WayToSteer{

//    #of Engines
    private int numberOfEngines;

//    name of the Vehicle

    private String name;

    //    # of Passengers boat can carry

    private int numberOfPassengers;

//    where you can use this vehicle

    private String whereToDrive;

//    Type of Steering device

    private SteeringDevice rudder = new SteeringDevice(new String[]{"north", "south", "east", "west"}, "rudder");

//    starter type

    private StarterType starterType;

    public Boat(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive, StarterType starterType){
        this.numberOfEngines = numberOfEngines;
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
        this.whereToDrive = whereToDrive;
        this.starterType = starterType;
    }

//    getters and setters


    @Override
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    @Override
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String getWhereToDrive() {
        return whereToDrive;
    }

    @Override
    public void setWhereToDrive(String whereToDrive) {
        this.whereToDrive = whereToDrive;
    }

    public SteeringDevice getRudder() {
        return rudder;
    }

    public void setRudder(SteeringDevice rudder) {
        this.rudder = rudder;
    }

    @Override
    public StarterType getStarterType() {
        return starterType;
    }

    @Override
    public void setStarterType(StarterType starterType) {
        this.starterType = starterType;
    }

//    Starts the boat
    public void start(){
        starterType.start(name);
    }

//    Stops the boat
    public void stop(){

    }

//    turn North
    public void turnNorth(){
        rudder.steer("north");
    }

//    turn South
    public void turnSouth(){
        rudder.steer("south");
    }

//    turn East
    public void turnEast(){
        rudder.steer("east");
    }

    //    turn West
    public void turnWest(){
        rudder.steer("west");

    }
}


