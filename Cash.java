package factoryMethod;

public class Cash implements Payment{
	
	  @Override
	  public void paymentMethod() {

	    System.out.println("Metodo de Pago: Efectivo");

	  }
}
