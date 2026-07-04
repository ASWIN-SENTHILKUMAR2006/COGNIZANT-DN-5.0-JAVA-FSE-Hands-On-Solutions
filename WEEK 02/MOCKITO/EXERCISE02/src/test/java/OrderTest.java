import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import restauraunt.Kitchen;
import restauraunt.Order;

/**
 * @author Aswin Senthilkumar
 *
 */

@ExtendWith(MockitoExtension.class)
public class OrderTest {
@Mock
Kitchen kitchen;

@InjectMocks
Order order;

@Test
public void sendOrderTest() {
	//Arrange
	String item = "Dosa";
	when(kitchen.makeFood("Dosa")).thenReturn(true); // when(kitchen.makeFood(item)).thenReturn(true);
	
	//Act
	boolean result = order.sendOrder(item);
	
	//Assert
	Assertions.assertEquals(true, result , "sendOrder method failed  -- send false");
	verify(kitchen,times(1)).makeFood(item);
}
}
