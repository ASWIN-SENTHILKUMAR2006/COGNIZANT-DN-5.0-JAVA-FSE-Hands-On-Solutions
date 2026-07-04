package restauraunt;

/**
 * @author Aswin Senthilkumar
 *
 */
public class Order {

	Kitchen kitchen;
	
	Order(Kitchen kitchen){
		this.kitchen = kitchen;
	}
	
	public boolean sendOrder(String item) {
		boolean result = kitchen.makeFood(item);
		System.out.println("Order  Done...");
		return result;
	}
	
	
	
//	public static void main(String[] args) {
//		Order od = new Order(new Kitchen());
//		od.sendOrder("Idly");
//	}
}
