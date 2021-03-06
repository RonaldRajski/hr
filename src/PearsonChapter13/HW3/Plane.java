package PearsonChapter13.HW3;

/********************************************
 * Name: Ronald Rajski
 * Class: COSC 1174
 * Assignment: HW3 Vehicles
 * Date: 9-17-21
 ********************************************/

public class Plane extends Vehicle implements WayToDrive, WayToFly{

//        # of Engines
        private int numberOfEngines;

//        vehicle Name
        private String name;

//        # of passengers
        private int numberOfPassengers;

//        Where to drive this vehicle
        private String whereToDrive;

//        steering device
        private SteeringDevice yoke = new SteeringDevice(new String[]{"left", "right", "straight", "up", "down"}, "yoke");

//        type of starter
        private StarterType starterType;


        public Plane(int numberOfEngines, String name, int numberOfPassengers, String whereToDrive, StarterType starterType) {
            this.numberOfEngines = numberOfEngines;
            this.name = name;
            this.numberOfPassengers = numberOfPassengers;
            this.whereToDrive = whereToDrive;
            this.starterType = starterType;
        }

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

        public SteeringDevice getYoke() {
            return yoke;
        }

        public void setYoke(SteeringDevice yoke) {
            this.yoke = yoke;
        }

        public StarterType getStarterType() {
            return starterType;
        }

        public void setStarterType(StarterType starterType) {
            this.starterType = starterType;
        }

//        starter
        public void start() {
            starterType.start(name);
        }

//        kill switch
        public void stop() {
            starterType.stop(name);
        }

//        go left
        public void turnLeft() {
            yoke.steer("left");
        }

//        go right
        public void turnRight() {
            yoke.steer("right");
        }

//        go straight
        public void goStraight() {
            yoke.steer("straight");
        }

//        go up
        public void up() {
            yoke.steer("up");
        }

//       go down
        public void down() {
            yoke.steer("down");
        }

}
