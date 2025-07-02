package com.nadirhussainnn.composition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Beamer {
	
	private static final Logger logger = LogManager.getLogger(Beamer.class);

	public Beamer(String name) {
	
		logger.info(String.format("Created beamer namec: %s",name));
		
	}
}