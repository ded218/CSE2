/////////////////////////////////////////////////////
//Deepshikha Das
//9.4.2014
//CSE 2 sect. 111
//I'm going to make a cyclometer program
//it's going to document
//the number of minutes and number of counts for each trip
//and it will print the distance of each tip as well as the distance for the two trips combined
//
public class Cyclometer {
        // main method required for every Java program
        public static void main(String[] args) {
        int secsTrip1=480; //these are the number of seconds for trip one
        int secsTrip2=3220; //these are the number of seconds for trip two
        int countsTrip1=1561; //these are the number of counts for trip one
        int countsTrip2=9037; //these are the number of counts for trip two
        double wheelDiameter=27.0, //this is the wheel diameter
        PI=3.41459, //the value of pi
        feetPerMile=5280, //how many feet are in a mile
        inchesPerFoot=12, //how many inches are in a foot
        secondsPerMinute=60; //how many seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //these are the the values we are looking at
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            //those up there are ouputs
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above is distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI
        distanceTrip1=inchesPerFoot*feetPerMile; //calculates distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
            //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        }  //end of the main method
} //end of class
