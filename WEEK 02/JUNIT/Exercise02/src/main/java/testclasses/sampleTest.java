package testclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Aswin Senthilkumar
 *
 */

public class sampleTest {
	
//Valid output Test Case
@ParameterizedTest(name="{index} factorial test case")
@CsvSource({"5,120","4,24"})
public void factorialTest(int n , int expectedResult) {
	int result  = sample.factorial(n);
	Assertions.assertEquals(expectedResult , result ,"Test Case Failed Expected Result not met");
}

//Invalid output Check Test Case 
@ParameterizedTest(name="{index} FalseCase Test : INPUT: {0} EXPECTED OUTPUT: {1})")
@CsvSource({"5,125","4,36"})
public void factorialTestFalse(int n , int expectedResult) {
	int result  = sample.factorial(n);
	Boolean ans = result == expectedResult ? true : false;
	Assertions.assertFalse(ans ,"False Case Failed: Result gives True");
}
}
