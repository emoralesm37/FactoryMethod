package factoryMethod;

public class Application {
	private static Shop shop;

	public static void main(String[] args) {
		   configure(args);
		    goShopping();
		  }

		  static void configure(String[] args) {

		    if (null != args && args[0].equalsIgnoreCase("Efectivo"))
		      shop = new CreditPayment();
		    else {
		      shop = new CashPayment();
		    }
		  }

		  static void goShopping() {
		    shop.buySomething();

	}

}
