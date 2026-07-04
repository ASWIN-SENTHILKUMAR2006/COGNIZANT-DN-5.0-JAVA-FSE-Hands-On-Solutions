package cafe;

/**
 * @author Aswin Senthilkumar
 *
 */
public class CoffeMaker {
	
Sugar sugar;

Coffee coffee;


CoffeMaker(Sugar sugar , Coffee coffee){
	this.sugar = sugar;
	this.coffee = coffee;
}

public  boolean MakeCoffee() {
	sugar.addSugar();
	boolean isCoffeeAdded = coffee.addCoffee();
	System.out.println( "Coffee is done");
	return isCoffeeAdded;
}


//public static void main(String[] args) {
//	CoffeMaker  cf = new CoffeMaker (new Sugar() , new Coffee());
//	cf.MakeCoffee();
//}


}
