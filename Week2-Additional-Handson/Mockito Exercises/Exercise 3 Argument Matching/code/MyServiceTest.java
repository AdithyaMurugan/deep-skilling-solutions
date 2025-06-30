package Week2_Mockito_Exercise3;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData(anyString())).thenReturn("Mocked");

        MyService service = new MyService(mockApi);
        String result = service.fetchData("Adithya");

        assertEquals("Mocked", result);
        verify(mockApi).getData(eq("Adithya")); // Argument matching
    }
}