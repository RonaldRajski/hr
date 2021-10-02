package PearsonChapter13.HW3;

/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3 Vehicles
 * Date: 9-17-21
 ********************************************/

public class Truck extends Vehicle implements WayToDrive{


//        # of engines
        private int numberOfEngines;

//       name of vehicle
        private String name;

//        # 0f passengers
        private int numberOfPassengers;

//        where to drive
        private String whereToDrive;

//        steering device
        private SteeringDevice wheel = new SteeringDevice(new String[]{"left", "right", "straight"}, "steering wheel");

//        type of starter
        private StarterType starterType;


        public Truck(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive, StarterType starterType) {
            this.numberOfEngines = numberOfEngines;
            this.name = name;
            this.numberOfPassengers = numberOfPassengers;
            this.whereToDrive = whereToDrive;
            this.starterType = starterType;
        }

//        getters and setters

        public int getNumberOfEngines() {
            return numberOfEngines;
        }

        public void setNumberOfEngines(int numberOfEngines) {
            this.numberOfEngines = numberOfEngines;
        }

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

        public String getWhereToDrive() {
            return whereToDrive;
        }

        public void setWhereToDrive(String whereToDrive) {
            this.whereToDrive = whereToDrive;
        }

        public SteeringDevice getWheel() {
            return wheel;
        }

        public void setWheel(SteeringDevice wheel) {
            this.wheel = wheel;
        }

        public StarterType getStarterType() {
            return starterType;
        }

        public void setStarterType(StarterType starterType) {
            this.starterType = starterType;
        }

//        Starts the car
        public void start() {
            starterType.start(name);
        }

//        Stops the car
        public void stop() {
            starterType.stop(name);
        }

//        turns left
        public void turnLeft() {
            wheel.steer("left");
        }

//      turns right
        public void turnRight() {
            wheel.steer("right");
        }

//       go straight ahead
        public void goStraight() {
            wheel.steer("straight");
        }

    }




