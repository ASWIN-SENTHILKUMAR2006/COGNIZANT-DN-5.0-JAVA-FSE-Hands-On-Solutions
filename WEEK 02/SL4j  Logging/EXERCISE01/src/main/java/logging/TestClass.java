package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author Aswin Senthilkumar
 *
 */
public class TestClass {
	private static Logger logger ;
public static void main(String[] args) {
	logger = LoggerFactory.getLogger(TestClass.class);
	
	logger.warn("Hello");
	logger.error("Error Message");

	
}
}
