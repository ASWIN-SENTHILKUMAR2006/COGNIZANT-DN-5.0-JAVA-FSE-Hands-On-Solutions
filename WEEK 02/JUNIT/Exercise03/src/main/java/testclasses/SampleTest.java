package testclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Aswin Senthilkumar
 *
 */
public class SampleTest {

@Test
@DisplayName("Add Test Case")
public void addTest() {
	//Arrange & Act
	int result = Sample.add(3, 2);
	//Assert
	Assertions.assertEquals(5,result,"Result dont match");
	Assertions.assertTrue(result>3,"Assertion True Failed - result wrong");
	Assertions.assertFalse(result>7,"Assertion False Failed - result wrong");
	//Assertions.assertNull(result,"Result is not Null");
	Assertions.assertNull(null,"Result is not Null");
	Assertions.assertNotNull(result,"Result is Null");
}
}
