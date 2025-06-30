package mockito_Exercise_7;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test(expected = RuntimeException.class)
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Action failed")).when(mockApi).riskyAction();

        MyService service = new MyService(mockApi);
        service.performRiskyAction();

        verify(mockApi).riskyAction();
    }
}