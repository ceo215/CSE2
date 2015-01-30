//Colin Orr
//January 30, 2015
//CSE 002
//Lab 2

//This cylcometer will, given time and wheel rotation count, print the number of minutes for two trips, the number of counts for each trip, the distance of each trip in miles, and the total distance.

//Add the class
public class Cyclometer {
    
//Add the main method
    public static void main (String [] args){
        
        
        //Define our input data
        int secsTrip1=480; //This variable sets the time of the first trip
        int secsTrip2=3220; //This variable sets the time of the second trip
        int countsTrip1=1561; //This variable sets the wheel rotation count from the first trip
        int countsTrip2=9037; //This variable sets the wheel rotation count from the second trip
        
        //Set intermediate variable and output data
        
        double wheelDiameter=27.0, //The diameter of the wheel.
        PI=3.14159, //The constant pi.
        feetPerMile=5280, //The number of feet in one mile.
        inchesPerFoot=12, //The number of inches in one foot.
        secondsPerMinute=60; //The number of seconds in one minute.
        double distanceTrip1, //Declares the variable for the distance of trip 1.
        distanceTrip2, //Declares the variable for the distance of trip 2.
        totalDistance; //Declares the variable for the total distance of both trips.
        
        //Print the values for trip time and wheel rotation.
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); //Print trip 1 data
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); //Print trip 2 data
        
        //Calculate the distances for each trip and the total. Then store the values.
        distanceTrip1=countsTrip1*wheelDiameter*PI; // Gives distance travelled for trip 1 in inches.
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance travelled for trip 1 in miles.
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives distance travelled for trip 2 in miles.
        totalDistance=distanceTrip1+distanceTrip2; //Finds the total distance of each trip
        
        //Print the results
        System.out.println("Trip 1 was " +distanceTrip1+ " miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");

    }
    
}
