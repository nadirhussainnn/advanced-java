package com.nadirhussainnn.singleton;

/*
 * The Singleton Pattern ensures that only one instance of a class exists
 * in the application and provides a global point of access to that instance.
 *  It’s often used for:
 * 	1. Configuration managers
 *  2. Logging services
 *  3. Connection pools
 *  4. Thread pools
 *  5. Shared caches
 * 
 * */

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if( instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("This is message from Singleton class ");
	}
}
