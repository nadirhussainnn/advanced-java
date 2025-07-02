package com.nadirhussainnn.composition;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

// I want to simulate the "composition" relationship between Building and Lecture Hall , and between LectureHall and Beamer. If Building is deleted, then both LectureHall and Beamer must be deleted. In java, I am trying to simulate this using object ownership and encapsulation.

public class Building {

	private static final Logger logger = LogManager.getLogger(Building.class);

	LectureHall lectureHall;
	
	public Building() {
		this.lectureHall = new LectureHall();
		logger.info("Building created with Lecture Hall");
	}
	
}