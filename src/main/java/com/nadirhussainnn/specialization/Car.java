/**
 * 
 */
package com.nadirhussainnn.specialization;

/**
 * Here I try to demonstrate the concept of specialization. 
 * Specialization is way of narrowing down the details by making a class specific
 * from general. We try to cast the general class (parent) into specific (child). 
 * Casting is not safe because classes will become more and more specific and
 * will give rise to doubts. For exp: If we say Vehicle is car - then we need
 * more proofs or details. But Generalization is safe, we don't need casting. 
 * Java compiler knows. In specialization, we need to do explicit casting.
 */


public class Car extends Vehicle{
	
	@Override
	public void driveVehicle() {
		System.out.print("Car is being driven");
	}
	public void showWheels() {
		System.out.println("Car weehls: 🛞🛞🛞🛞");
	}
}
