package cafe;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
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
	
//	Sugar sugar = mock(Sugar.class);
//	Coffee coffee = mock(Coffee.class);
//	CoffeMaker coffeeMachine = new CoffeMaker(sugar,coffee);
																			//stubbing --MOCKITO PHASE -01
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
when(coffee.addCoffee()).thenReturn(true);
boolean result = coffeeMachine.MakeCoffee();

//Assert 
																		//verifying --MOCKITO PHASE -02
Assertions.assertEquals(true,result,"Coffee was not made -- returned false");
verify(sugar,times(1)).addSugar();
verify(coffee,times(1)).addCoffee();//never()
	
}


}
