package SpringTestingExercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(10, calculatorService.add(7, 3));
    }
}
