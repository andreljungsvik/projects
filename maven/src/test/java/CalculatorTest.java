import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(4, calculator.add(2, 2));
  }
}