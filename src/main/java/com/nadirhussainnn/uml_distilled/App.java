package com.nadirhussainnn.uml_distilled;

import com.nadirhussainnn.specialization.*;
import com.nadirhussainnn.composition.Building;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

    	logger.error("This project is to get hands on experience with Maven and UML concepts together");
    	Building building = new Building();

    	//Specialization example
    	
    	Car car;
    	// We need to cast the super class into sub-class. That is possible, but we 
    	// won't be able to access the methods of super class, neither we can access 
    	// methods of sub-class
    	
    	//car = (Car) new Vehicle();
    	//car.driveVehicle();// will throw an error. Vehicle can not be cast to Car
    	
    	Vehicle vehicle = new Car();
    	vehicle.driveVehicle();
    	//vehicle.showWheels(); can't access this
    	
    	// Now we can narrow down this vehicle reference, and cast it into Car
    	car = (Car)vehicle;
    	car.showWheels();		// can access parents methods as well
    	car.driveVehicle();
    	
    	
    	//Generalization example
    	
    	Vehicle vehicle2;
    	vehicle2 = new Car();
    	
    	vehicle2.driveVehicle(); // parent class method is invoked unless we override method in child
    	// vehicle2.showWheels(); This won't work, because 
    	
    	
    	
    }
}
