package DecoratorPattern;

public class DecoratorPatternTest {
	 public static void main(String[] args) {

	        
	        Notifier emailOnly = new EmailNotifier();
	        emailOnly.send("Welcome to the system.");

	        System.out.println();

	        
	        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
	        emailAndSMS.send("Your OTP is 4567.");

	        System.out.println();

	        
	        Notifier fullNotify = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
	        fullNotify.send("Deployment completed successfully.");
	    }
	}

