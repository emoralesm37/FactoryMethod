package factoryMethod;

public class CreditPayment extends Shop{
	
	  @Override
	  public Payment makePayment() {
	      return new CreditCard();
	  }

}
