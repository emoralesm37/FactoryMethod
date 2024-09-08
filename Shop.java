package factoryMethod;

public abstract class Shop {
	
	private Payment payment;

	public void buySomething() {

	    setPayment(makePayment());
	    makePayment().paymentMethod();
	  }

	  public abstract Payment makePayment();

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
