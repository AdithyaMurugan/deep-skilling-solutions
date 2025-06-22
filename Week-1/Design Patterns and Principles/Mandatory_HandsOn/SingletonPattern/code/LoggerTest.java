package singleton;

public class LoggerTest {
	public static void main(String[] args) {       
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();        
        logger1.log("First log from logger1.");
        logger2.log("Second log from logger2.");
        if (logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Error: Different instances detected!");
        }
    }
}
