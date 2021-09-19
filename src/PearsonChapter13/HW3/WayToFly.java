package PearsonChapter13.HW3;


//Movement for plane
public interface WayToFly {

    /********************************************
     * Name: Ronald Rajski
     * Class: COSC 1174
     * Assignment: HW3 Vehicles
     * Date: 9-17-21
     ********************************************/

//interface Way to drive
    public interface WayToDrive {
        //    describes direction you are turning
        void turnLeft();

        //    describes direction you are turning
        void turnRight();

        //describbes moving forward
        void g0Straight();

    //        describes going up

        public void up();

        //        describes going down
        public void down();

    }


}
