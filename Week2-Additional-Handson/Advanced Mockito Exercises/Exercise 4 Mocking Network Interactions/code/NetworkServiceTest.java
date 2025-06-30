package advancedMockitoexercise4;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        // Arrange
        NetworkClient mockNetworkClient = mock(NetworkClient.class);
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Act
        NetworkService networkService = new NetworkService(mockNetworkClient);
        String result = networkService.connectToServer();

        // Assert
        assertEquals("Connected to Mock Connection", result);
    }
}
