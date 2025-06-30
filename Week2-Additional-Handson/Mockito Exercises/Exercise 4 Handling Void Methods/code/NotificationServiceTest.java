package mockito_Exercise_4;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testVoidMethod() {
        
        Logger mockLogger = mock(Logger.class);

       
        doNothing().when(mockLogger).log(anyString());

        
        NotificationService service = new NotificationService(mockLogger);
        service.sendNotification("Hello Adithya");

       
        verify(mockLogger).log("Notification sent: Hello Adithya");
    }
}
