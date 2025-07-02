package com.nadirhussainnn.uml_distilled;

import com.nadirhussainnn.composition.Building;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

    	logger.error("This project is to get hands on experience with Maven and UML concepts together");
    	Building building = new Building();

    }
}
