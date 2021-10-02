package PearsonChapter13.HW3;

/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3 Vehicles
 * Date: 9-17-21
 ********************************************/

public class StarterType{

//    name of starter
private String name;

    public StarterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Starts the vehicle
     */
    void start(String vehicleName) {
        System.out.printf("The %s turns the %s on.%n", name, vehicleName);
    }

    /**
     * Stops the vehicle
     */
    void stop(String vehicleName) {
        System.out.printf("The %s turns the %s off.%n", name, vehicleName);
    }

}
