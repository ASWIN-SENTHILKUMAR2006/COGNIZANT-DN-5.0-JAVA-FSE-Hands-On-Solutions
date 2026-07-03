package cafe;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Aswin Senthilkumar
 *
 */
@ExtendWith(MockitoExtension.class)
public class CoffeMakerTest {

//Arrange
	
@Mock
Sugar sugar;

@Mock
Coffee coffee;

@InjectMocks
CoffeMaker coffeeMachine;

// sugar calls void function no need for stub

@Test
@DisplayName("MakeCoffee()  - Test Case")
public void MakeCoffeeTest() {

// Act
boolean result = coffeeMachine.MakeCoffee();

//Assert 
Assertions.assertEquals(true,result,"Coffee was not made -- returned false");
verify(sugar,times(1)).addSugar();
verify(coffee,times(1)).addCoffee();//never()
	
}


}
