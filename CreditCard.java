package factoryMethod;

public class CreditCard implements Payment{

	  @Override
	  public void paymentMethod() {

	    System.out.println("Metodo de Pago: Tarjeta de Credito");

	  }
}
