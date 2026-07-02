import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Aswin Senthilkumar
 *
 */
public class SampleClassTest {

@Test
@DisplayName("Check Setup TestCase")
public void checkSetupTest() {
	boolean result = sampleClass.checkSetup();
	Assertions.assertTrue(result , "Test Case Failed");
}
}
