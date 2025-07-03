/**
 * 
 */
package com.nadirhussainnn.specialization;

/**
 * Specialization:
 * 
 * Here I try to demonstrate the concept of specialization. 
 * Specialization is way of narrowing down the details by making a class specific
 * from general. We try to cast the general class (parent) into specific (child). 
 * Casting is not safe because classes will become more and more specific and
 * will give rise to doubts. For exp: If we say Vehicle is car - then we need
 * more proofs or details. But Generalization is safe, we don't need casting. 
 * Java compiler knows. In specialization, we need to do explicit casting.
 */

/*
 * Generalization:
 * 
 * Converting a subclass type into a superclass type is called 'Generalization'
 * because we are making the subclass to become more general and its scope is
 * widening. This is also called widening or up casting. Widening is safe because
 * the classes will become more general. For example, if we say Car is a Vehicle,
 * there will be no objection. Thus Java compiler will not ask for cast operator
 * in generalization
 * 
 * 
 * */

public class Vehicle {
	
	public void driveVehicle() {
		System.out.println("Vehicle is running");
	}
}