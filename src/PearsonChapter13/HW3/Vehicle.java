package PearsonChapter13.HW3;


/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3 Vehicles
 * Date: 9-17-21
 ********************************************/

public abstract class Vehicle {


//    Name of the vehicle
    private String name;

//    Number of passengers
    private int numberOfPassengers;

//    Number of engines vehicle has
    private int numberOfEngines;

//    type of starter the vehicle has
    private StarterType starterType;

//    where vehicle can operate
    private String whereToDrive;

//    getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public StarterType getStarterType() {
        return starterType;
    }

    public void setStarterType(StarterType starterType) {
        this.starterType = starterType;
    }

    public String getWhereToDrive() {
        return whereToDrive;
    }

    public void setWhereToDrive(String whereToDrive) {
        this.whereToDrive = whereToDrive;
    }

    /**
     * Method which compares two vehicle's passenger limits and returns
     * the name of the one that holds more passengers
//     * @param vehicle to compare numberOfPassengers with
     * @return String  Vehicle.name or "neither", depending on whether one vehicle
     *                  carries more passangers than the other
     */
    public String isLarger(Vehicle vehicleOne, Vehicle vehicleTwo) {
        String largerVehicleReturn;
        if(vehicleOne.getNumberOfPassengers() > vehicleTwo.getNumberOfPassengers()) {
            largerVehicleReturn = "The " + vehicleOne.getName() + " is larger than the " + vehicleTwo.getName();
        } else if (vehicleTwo.getNumberOfPassengers() > vehicleOne.getNumberOfPassengers()) {
            largerVehicleReturn = "The " + vehicleTwo.getName() + " is larger than the " + vehicleOne.getName();
        } else {
            largerVehicleReturn = "Both the " + vehicleOne.getName() + " and the " + vehicleTwo.getName() + " carry the same number of passengers";
        }
        return largerVehicleReturn;
    }

    /**
     * Method which compares two vehicle's number of engines and returns
     * the name of the one that has more engines
//     * @param vehicle to compare numberOfEngines with
     * @return String  Vehicle.name or "neither", depending on whether one vehicle
     *                  has more engines than the other
     */
    public String isFaster(Vehicle vehicleOne, Vehicle vehicleTwo) {
        String fasterVehicleReturn;
        if(vehicleOne.getNumberOfEngines() > vehicleTwo.getNumberOfEngines()) {
            fasterVehicleReturn = "The " + vehicleOne.getName() + " is faster than the " + vehicleTwo.getName();
        } else if (vehicleTwo.getNumberOfEngines() > vehicleOne.getNumberOfEngines()) {
            fasterVehicleReturn = "The " + vehicleTwo.getName() + " is faster than the " + vehicleOne.getName();
        } else {
            fasterVehicleReturn = "Both the " + vehicleOne.getName() + " and the " + vehicleTwo.getName() + " are the same speed.";
        }
        return fasterVehicleReturn;
    }

//  abstract method to start vehicle
    public abstract void start();

// abstract method to stop vehicle
    public abstract void stop();

}
