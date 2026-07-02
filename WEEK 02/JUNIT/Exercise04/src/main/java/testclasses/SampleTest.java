package testclasses;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author Aswin Senthilkumar
 *
 */
public class SampleTest {

	@BeforeAll
	public static void startBanner() {
		System.out.println("Starting Test for Fruits ");
	}
	
	@AfterAll
	public static void endBanner() {
		System.out.println("Ending Test for Fruits");
	}
	
	@ParameterizedTest(name="{index} Fruits Test Case")
	@ValueSource(strings = {"Apple" , "Guauva","Mango"})
	public void addFruitsTest(String ip) {
		//Arrange
		String input = ip;
		
		//Act 
		Sample.addFruit(input);
		
		//Assert
		Assertions.assertEquals(1 ,Sample. fruits.size() );
	}
	
	@BeforeEach
	public void label() {
		System.out.println("Executinng a Test Case");
	}
	
	@AfterEach
	public void cleanup() {
		Sample.fruits.clear();
	}
	
	
	
}
