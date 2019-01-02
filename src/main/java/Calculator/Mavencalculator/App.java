package Calculator.Mavencalculator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());

	static {
		BasicConfigurator.configure();
	}

	public static int add(int a, int b) {
//		BasicConfigurator.configure();
		logger.info("Addition BEGINS!!");
		return a + b;
	}

	public static int subtract(int a, int b) {
		logger.info("subtraction BEGINS!!");
		return a - b;
	}

	public static int multiply(int a, int b) {
		logger.info("multiplication BEGINS!!");
		return a * b;
	}

	public static int divide(int a, int b) throws ArithmeticException {
		logger.info("division BEGINS!!");
		return a / b;
	}
}
