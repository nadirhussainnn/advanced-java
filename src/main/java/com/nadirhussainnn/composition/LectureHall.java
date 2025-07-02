package com.nadirhussainnn.composition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LectureHall {

	private static final Logger logger = LogManager.getLogger(LectureHall.class);
	
	private Beamer beamer;
	
	public LectureHall() {
		this.beamer = new Beamer("Short lived beamer");
		logger.info("LectureHall created with beamer");
	}
}
