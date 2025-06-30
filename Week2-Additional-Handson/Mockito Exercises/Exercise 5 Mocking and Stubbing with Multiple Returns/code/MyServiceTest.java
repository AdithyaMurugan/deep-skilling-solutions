package mockito_Exercise_5;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        
        when(mockApi.getData()).thenReturn("Data1", "Data2", "Data3");

     
        MyService service = new MyService(mockApi);

        assertEquals("Data1", service.fetchData());
        assertEquals("Data2", service.fetchData());
        assertEquals("Data3", service.fetchData());
    }
}
