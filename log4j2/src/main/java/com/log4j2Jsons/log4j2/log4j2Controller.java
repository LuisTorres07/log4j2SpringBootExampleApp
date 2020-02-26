package com.log4j2Jsons.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Controller {
	private static final Logger logger = LogManager.getLogger(log4j2Controller.class);

	   public static void main(String[] args) {

	      logger.trace("Entering application...");
	      logger.info("Hello Log4j2...");
	      logger.error("Something is wrong with this code", new Exception("Invalid message"));
	      logger.fatal("This is Fatal LOG");
	      logger.warn("This is a Warning");
	      logger.trace("Exiting application...");
	   }
}
