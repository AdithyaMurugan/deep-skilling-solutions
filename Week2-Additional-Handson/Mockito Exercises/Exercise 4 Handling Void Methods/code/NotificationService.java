package mockito_Exercise_4;

public class NotificationService {
	 private Logger logger;

	    public NotificationService(Logger logger) {
	        this.logger = logger;
	    }

	    public void sendNotification(String message) {
	        // Just log the message
	        logger.log("Notification sent: " + message);
	    }
}
